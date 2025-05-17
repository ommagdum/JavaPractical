package Exp11;

import javax.swing.*;
import java.awt.*;

public class SimpleStopwatch extends JFrame {

    private JLabel timeLabel;
    private JButton startBtn, stopBtn, lapBtn, resetBtn;
    private JTextArea lapArea;
    private long startTime;
    private boolean running = false;
    private Thread timerThread;

    public SimpleStopwatch() {
        setTitle("Simple Stopwatch");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Time label
        timeLabel = new JLabel("00:00:000", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel, BorderLayout.NORTH);

        // Button panel
        JPanel panel = new JPanel();
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        lapBtn = new JButton("Lap");
        resetBtn = new JButton("Reset");
        panel.add(startBtn);
        panel.add(stopBtn);
        panel.add(lapBtn);
        panel.add(resetBtn);
        add(panel, BorderLayout.CENTER);

        // Lap display
        lapArea = new JTextArea();
        lapArea.setEditable(false);
        add(new JScrollPane(lapArea), BorderLayout.SOUTH);

        // Button actions
        startBtn.addActionListener(e -> startTimer());
        stopBtn.addActionListener(e -> stopTimer());
        lapBtn.addActionListener(e -> recordLap());
        resetBtn.addActionListener(e -> resetTimer());

        setVisible(true);
    }

    private void startTimer() {
        if (!running) {
            running = true;
            startTime = System.currentTimeMillis();

            timerThread = new Thread(() -> {
                while (running) {
                    long now = System.currentTimeMillis();
                    long elapsed = now - startTime;
                    SwingUtilities.invokeLater(() -> timeLabel.setText(formatTime(elapsed)));
                    try {
                        Thread.sleep(100); // update every 100ms
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            timerThread.start();
        }
    }

    private void stopTimer() {
        running = false;
    }

    private void resetTimer() {
        running = false;
        timeLabel.setText("00:00:000");
        lapArea.setText("");
    }

    private void recordLap() {
    	
        if (running) {
            long now = System.currentTimeMillis();
            long elapsed = now - startTime;
            lapArea.append("Lap: " + formatTime(elapsed) + "\n");
        }
    }

    private String formatTime(long ms) {
        long minutes = (ms / 60000) % 60;
        long seconds = (ms / 1000) % 60;
        long milliseconds = ms % 1000;
        return String.format("%02d:%02d:%03d", minutes, seconds, milliseconds);
    }

    public static void main(String[] args) {
        new SimpleStopwatch();
    }
}

