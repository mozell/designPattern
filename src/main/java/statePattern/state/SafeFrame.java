package statePattern.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private final TextField textClock = new TextField(60);
    private final TextArea textScreen = new TextArea(10, 60);
    private final Button buttonUse = new Button("금고사용");
    private final Button buttonAlarm = new Button("비상벨");
    private final Button buttonPhone = new Button("일반통화");
    private final Button buttonExit = new Button("종료");

    private State state = DayState.getInstance();

    public SafeFrame(String title) throws HeadlessException {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        add(panel, BorderLayout.SOUTH);

        pack();
        show();

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockString = "현재 시간은 ";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println(this.state + "에서" + state + "로 상태가 변화했습니다.");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("경비센터 CALL : " + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("경비센터 기록 : " + msg + "\n");
    }
}
