package stone2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbilityStoneEnhancement {
    private JFrame frame;
    private JButton enhanceButton;
    private JLabel currentLevelLabel;
    private JLabel resultLabel;

    private int currentLevel;

    public AbilityStoneEnhancement() {
        currentLevel = 0;

        frame = new JFrame("로스트아크 어빌리티 스톤 세공");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        currentLevelLabel = new JLabel("현재 레벨: " + currentLevel);
        resultLabel = new JLabel();

        enhanceButton = new JButton("세공 시작");
        enhanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enhanceAbilityStone();
            }
        });

        frame.add(currentLevelLabel);
        frame.add(enhanceButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }

    private void enhanceAbilityStone() {
        // 어빌리티 스톤 세공 로직 구현
        // 예시로 현재 레벨을 1씩 증가시킴
        currentLevel++;
        currentLevelLabel.setText("현재 레벨: " + currentLevel);
        resultLabel.setText("어빌리티 스톤 세공 완료! 레벨 " + currentLevel + "로 업그레이드되었습니다.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AbilityStoneEnhancement();
            }
        });
    }
}
