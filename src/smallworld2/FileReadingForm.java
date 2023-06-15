package smallworld2;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class FileReadingForm extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton openButton;
    private JButton calculateButton;

    public FileReadingForm() {
        // 프레임 설정
        setTitle("Small World");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 텍스트 영역
        textArea = new JTextArea();
        textArea.setEditable(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 버튼
        openButton = new JButton("Open File");
        openButton.addActionListener(this);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        // 컴포넌트 배치
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openButton);
        buttonPanel.add(calculateButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FileReadingForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openButton) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(filePath));
                    String line;
                    StringBuilder content = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    reader.close();
                    textArea.setText(content.toString());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Failed to open file: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource() == calculateButton) {
            // Calculate 버튼이 눌렸을 때 수행할 작업을 추가하세요.
            // 예를 들어, 텍스트 영역의 내용을 분석하거나 계산하는 로직을 구현할 수 있습니다.
            

            String filePath = "C:\\Users\\Administrator\\Desktop\\";
        	
        	ArrayList<_Object> al = new ArrayList<>();
        	
        	String input = textArea.getText();
        	
        	String[] lines = input.split("\n");
            
        	for(String line : lines) {
        		String[] values = line.split("/");
        		al.add(new _Object(values[0], values[1], values[2], values[3], values[4], values[5])); 
        	}
        	
        	Search search = new Search(al);
        	new _PrintResult(filePath, search._ReturnResult());
        	
        	
            int option = JOptionPane.showConfirmDialog(this,
                    "Done!\nDelete the text in the textarea?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                textArea.setText(""); // 텍스트 영역의 내용 삭제
            }
        	
        }
    }
}
