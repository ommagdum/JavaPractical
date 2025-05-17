package Exp11;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class TestTimer extends JFrame {

	public JLabel timeLabel;
	public JButton startBtn,stopBtn, lapBtn, resetBtn;
	public JTextArea lapArea;
	public long startTime;
	public boolean running = false;
	public Thread timerThread;
	
	public TestTimer()
	{
		setTitle("Lap Counter");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		timeLabel =new JLabel("00:00:000", SwingConstants.CENTER);
		timeLabel.setFont(new Font("Ariel", Font.BOLD, 14));
		add(timeLabel,BorderLayout.NORTH);
		
		JPanel panel=new JPanel();
		startBtn=new JButton("Start");
		stopBtn=new JButton("Stop");
		lapBtn=new JButton("Lap");
		resetBtn=new JButton("Reset");
		panel.add(startBtn);
		panel.add(stopBtn);
		panel.add(lapBtn);
		panel.add(resetBtn);
		add(panel, BorderLayout.CENTER);
		
		lapArea =new JTextArea();
		lapArea.setEditable(false);
		add(new JScrollPane(lapArea),BorderLayout.SOUTH);
		
		startBtn.addActionListener(e -> startTimer());
		stopBtn.addActionListener(e -> stopTimer());
		lapBtn.addActionListener(e -> lapTimer());
		resetBtn.addActionListener(e -> resetTimer());
		
		setVisible(true);
	}
	public void startTimer()
	{
		if (!running) {
            running = true;
            startTime = System.currentTimeMillis();
		}
	}
	public void stopTimer()
	{
		running = false;
	}
	public void resetTimer()
	{
		running = false;
        timeLabel.setText("00:00:000");
        lapArea.setText("");
	}
	public void lapTimer()
	{
		
		if (running) {
            long now = System.currentTimeMillis();
            long elapsed = now - startTime;
            lapArea.append("Lap: " + formatTime(elapsed) + "\n");
        }
	}
	public String formatTime(long ms) {
        long minutes = (ms / 60000) % 60;
        long seconds = (ms / 1000) % 60;
        long milliseconds = ms % 1000;
        return String.format("%02d:%02d:%03d", minutes, seconds, milliseconds);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new TestTimer();
	}

}
