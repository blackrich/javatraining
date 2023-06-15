package calculator2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorForm extends JFrame implements ActionListener {
	private JTextArea inputArea;
    private JButton clearButton;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;

    public CalculatorForm() {
        // 프레임 설정
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 입력 필드
        inputArea = new JTextArea(3, 20);
        inputArea.setEditable(true);
        JScrollPane inputScrollPane = new JScrollPane(inputArea);

        // 숫자 패드
        JPanel numberPadPanel = new JPanel(new GridLayout(4, 3));
        numberButtons = new JButton[12];
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "C", "0", "CE"};
        for (int i = 0; i < 12; i++) {
            numberButtons[i] = new JButton(numbers[i]);
            numberButtons[i].addActionListener(this);
            numberPadPanel.add(numberButtons[i]);
        }

        // 사칙연산 버튼
        JPanel operatorPanel = new JPanel(new GridLayout(4, 1));
        operatorButtons = new JButton[4];
        String[] operators = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            operatorButtons[i] = new JButton(operators[i]);
            operatorButtons[i].addActionListener(this);
            operatorPanel.add(operatorButtons[i]);
        }

        // 클리어 버튼
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        // 컴포넌트 배치
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputArea, BorderLayout.NORTH);
        panel.add(numberPadPanel, BorderLayout.CENTER);
        panel.add(operatorPanel, BorderLayout.EAST);
        panel.add(clearButton, BorderLayout.SOUTH);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == clearButton) {
            inputArea.setText("");
        } else {
            String currentText = inputArea.getText();
            if (source instanceof JButton) {
                JButton button = (JButton) source;
                String buttonText = button.getText();
                inputArea.setText(currentText + buttonText);
            }
        }
    }
}
