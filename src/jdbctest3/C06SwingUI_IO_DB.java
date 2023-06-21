package jdbctest3;

import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Date;


class GUI extends JFrame implements ActionListener,KeyListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JTextField txt1;
	
	JTextField txt2;
	JTextArea area1;
	JScrollPane scroll1;
	
	//DB INSERT FRAME_WINDOW
	JFrame Frm_Insert;
	JFrame Frm_Update;
	JFrame Frm_Delete;
	JFrame Frm_Select;
	
	JPanel panel2 = new JPanel();		//패널생성
	JTextArea txt10 = new JTextArea();
	JButton btn30 = new JButton("INSERT");
	
	static String id="root";
	static String pw="1234";
	static String url="jdbc:mysql://localhost:3306/tmpdb";
	
	//JDBC참조변수	
	static Connection conn=null;			// DB연결용 참조변수
	static PreparedStatement pstmt = null;	// SQL쿼리 전송용 참조변수
	static ResultSet res = null;			// SQL쿼리 결과(SELECT결과) 수신용 참조변수
	
	
	
	
	GUI(){
		//Frame
		super("프레임창입니다");
		setBounds(100,100,550,400);
		
		//Panel
		JPanel panel = new JPanel();		//패널생성
		panel.setLayout(null);
		
		//Component
		btn1 = new JButton("IO_저장하기");
		btn2 = new JButton("IO_불러오기");
		btn3 = new JButton("DB_INSERT");
		btn4 = new JButton("DB_UPDATE");
		btn5 = new JButton("DB_DELETE");
		btn6 = new JButton("DB_SELECT");
		txt1=new JTextField();
		txt2=new JTextField();
		area1=new JTextArea();
		//area1.setBounds(10,90,210,300);
		scroll1=new JScrollPane(area1);
		
		
		//Positioning
		txt1.setBounds(10,270,350,30);
		btn1.setBounds(370,10,120,30);
		btn2.setBounds(370,50,120,30);
		btn3.setBounds(370,90,120,30);	//DB_INSERT
		btn4.setBounds(370,130,120,30);	//DB_UPDATE
		btn5.setBounds(370,170,120,30);	//DB_UPDATE
		btn6.setBounds(370,210,120,30);	//DB_UPDATE
		scroll1.setBounds(10,10,350,250);
		
		
		//Event처리
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		btn3.addActionListener(this); //DB
		btn4.addActionListener(this); //DB
		btn5.addActionListener(this); //DB
		btn6.addActionListener(this); //DB
		txt1.addKeyListener(this);
		area1.setEditable(false);

		
		
		//Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(txt1);
		panel.add(txt2);
//		panel.add(area1);
		panel.add(scroll1);
		
		//Frame
		add(panel);	//프레임에 panel추가
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		//System.out.println("이벤트 발생");
		if(e.getSource()==btn1) {
			System.out.println("저장하기 클릭");
			
			String context = area1.getText();
			String dirPath = "c:\\iotest\\";
			String filename = UUID.randomUUID().toString();
			
			try {
				Writer out = new FileWriter(dirPath+filename+".txt");
				out.write(new Date().toString()+"\n");
				out.write(context);
				out.flush();
				out.close();
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

		}else if(e.getSource()==btn2) {
			System.out.println("불러오기 클릭");
			JFileChooser fileChooser = new JFileChooser();
			
			File defaultdirpath = new File("c:\\iotest\\");	//기본경로 File객체
			fileChooser.setCurrentDirectory(defaultdirpath);//기본경로 설정
			
			int returnValue= fileChooser.showOpenDialog(null);
			String filename=null;
			if(returnValue==JFileChooser.APPROVE_OPTION)	//파일선택한경우
			{
				filename=fileChooser.getSelectedFile().toString();
			}
			System.out.println(filename);
			
			try {
				Reader in = new FileReader(filename);
				area1.setText("");
				StringBuffer buffer=new StringBuffer();
				while(true)
				{
					int data=in.read();
					if(data==-1)
						break;
					buffer.append((char)data);
				}
				in.close();
				area1.append(buffer.toString());
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		else if(e.getSource()==btn3)
		{
			//DB_INSERT
			System.out.println("DB_INSERT");
			if(Frm_Insert==null) {
				
				ConnectDB();
				
				Frm_Insert = new JFrame("DB_INSERT");
				Frm_Insert.setBounds(650,100,300,400);
				panel2.setLayout(null);

				
				txt10.setBounds(10,10,260,300);
				btn30.setBounds(10,320,260,30);
				
				panel2.add(txt10);
				panel2.add(btn30);
				
				Frm_Insert.setContentPane(panel2);
				
                btn30.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        String txt = txt10.getText();
                        
                		try{
                			pstmt = conn.prepareStatement("insert into tbl_memo(contents, regdate) values ('" + txt + "', now())");
                			pstmt.executeUpdate();
                		}catch(Exception e1) {
                			e1.printStackTrace();
                		}	
                		
                		txt10.setText("");
                    }
                });
				
				
				
				
				
				//X 버튼 누를때 setVisible(false)로 설정됨
				Frm_Insert.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Insert.setVisible(true);
				
				Frm_Insert.getContentPane().setLayout(null);
			}else
			{
				Frm_Insert.setVisible(true);
			}
			
			//JTextArea의 내용을 메모를 가져와서 tbl_memo 저장한다
			
			

		}
		else if(e.getSource()==btn4) {
			//DB_UPDATE
			System.out.println("DB_UPDATE");
			
			if(Frm_Update==null) {
				
				Frm_Update = new JFrame("DB_UPDATE");
				Frm_Update.setBounds(650,100,300,400);
				//X 버튼 누를때 setVisible(false)로 설정됨
				Frm_Update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Update.setVisible(true);	
			}else
			{
				Frm_Update.setVisible(true);
			}

			//메모를 조회하여 가져온다 / Select(memo_id) 의 결과
			//조회된 메모를 수정하여 update 한다
			

			
		}
		else if(e.getSource()==btn5) {
			//DB_DELETE
			System.out.println("DB_DELETE");
			
			if(Frm_Delete==null) {
				
				Frm_Delete = new JFrame("DB_DELETE");
				Frm_Delete.setBounds(650,100,300,400);
				//X 버튼 누를때 setVisible(false)로 설정됨
				Frm_Delete.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Delete.setVisible(true);	
			}else
			{
				Frm_Delete.setVisible(true);
			}
			
		}
		else if(e.getSource()==btn6) {
			//DB_SELECT
			System.out.println("DB_SELECT");
			
			if(Frm_Select==null) {
				
				Frm_Select = new JFrame("DB_SELECT");
				Frm_Select.setBounds(650,100,400,400);
				//X 버튼 누를때 setVisible(false)로 설정됨
				Frm_Select.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				Frm_Select.setVisible(true);	
			}else
			{
				Frm_Select.setVisible(true);
			}
			
		
		}else if(e.getSource()==btn30) {
			System.out.println("DB_SELECT");
			
		}
		
		
		
		
		 
		
		
	}



	@Override
	public void keyTyped(KeyEvent e) {	
		//키를 눌렀을때/뗏을때(UNICODE 지원)
//		System.out.println("keyTyped() : "+e.getKeyChar());
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//키를 눌렀을때
//		System.out.println("keyPressed() : "+e.getKeyChar());
//		System.out.println("keyPressed() : "+e.getKeyCode());
		if(e.getSource()==txt1)
		{
			if(e.getKeyCode()==10)
			{
				System.out.println("txt1's Enter");
				String str= txt1.getText();
				area1.append(str+"\n");
				txt1.setText("");
			}
			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		//키를 뗏을때(UNICODE 미지원)
//		System.out.println("keyReleased() : " + e.getKeyChar());
//		System.out.println("keyReleased() : " + e.getKeyCode());

	}
	
	

	public static void UpdateDB() {
		try {
			pstmt = conn.prepareStatement("update tbl_product set prod_name = ? where prod_id = ?");
			pstmt.setString(1, "desktop");
			pstmt.setString(2, "1");
			pstmt.executeUpdate();
		}catch(Exception e) {
			
		}
	}
	
	public static void DeleteDB() {
		try {
			pstmt = conn.prepareStatement("delete from tbl_product");
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ShowTBL() {
		try {

			
			pstmt = conn.prepareStatement("select * from tbl_product");

			res = pstmt.executeQuery();
			System.out.println("===================");
			while(res.next()) {
				String prod_id = res.getString("prod_id");
				String prod_name = res.getString("prod_name");
				int prod_amount = res.getInt("amount");
				
				System.out.println(prod_id +", "+ prod_name + ", " + prod_amount);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void InsertDB(String product_id, String product_name, int amount) {
		
		try{
			pstmt = conn.prepareStatement("insert into tbl_product values('" + product_id + "', '" + product_name + "', " + amount + ")");
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}		

	}
	
	public static void ConnectDB(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,pw);
		}catch(Exception e) {
			
		}
	}
	
	public static void disConnectDB(){
		try {
			if(conn != null) conn.close();
			if(pstmt != null) pstmt.close();
			if(res != null)res.close();
		}catch(Exception e) {
		
		}
	}
	
	
	
	
}





public class C06SwingUI_IO_DB {

	public static void main(String[] args) {
		new GUI();
	}
}


