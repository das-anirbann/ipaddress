import javax.swing.*;


    public class Main{
    public static void main(String args[]){
        JFrame frame= new JFrame();
        frame.setSize(800,800);
        frame.setLayout(null);
       
       /*  //add label
        JLabel label = new JLabel("click the button--> ");
        label.setBounds(20,30,100,50);
        frame.add(label);

        //add button
        JButton b1 = new JButton("click me");
        b1.setBounds(150 ,30,100,50);
        frame.add(b1);

        //add textfeild
        JTextField t1 = new JTextField();
        t1.setBounds(10,90,200,22);
        frame.add(t1);

        //add password
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(30,150,100,50);
        frame.add(p1);

        //textarea
        JTextArea t2 = new JTextArea("lorem35");
        t2.setBounds(30, 200, 100, 70);
        frame.add(t2);

        //tabel
        String columns[]={"id","name","salary"};
        String data[][]={{"1","Anirban Das","5000"},
                          {"2","Banani Dutta","2000"}};
        JTable tb1 = new JTable(data,columns);
        tb1.setBounds(50, 300, 200, 300);
        frame.add(tb1);*/

       /* //checkbox
         JLabel label2 = new JLabel("Check the button ");
        label2.setBounds(50,450,150,30);
        frame.add(label2);

        JCheckBox c1 = new JCheckBox("I am Here");
        c1.setBounds(150, 455, 100, 30);
        frame.add(c1);

        JRadioButton r1 = new JRadioButton("abc");
        r1.setBounds(150, 480, 90, 30);
        frame.add(r1);

        JRadioButton r2 = new JRadioButton("def");
        r2.setBounds(150, 500, 100, 30);
        frame.add(r2);

        String data[]={"c++","python","JavaScript"};
        JComboBox cb1= new JComboBox(data);
        cb1.setBounds(150, 550, 100, 30);
        frame.add(cb1);*/


      //  JOptionPane.showMessageDialog(frame, "welcome to swing","Alert",JOptionPane.WARNING_MESSAGE);
        /*  String name= JOptionPane.showInputDialog(frame,"enter your name");
         System.out.println(name);
*/

      JMenuBar mb = new JMenuBar();
      JMenu menu = new JMenu("menu");
      JMenu submenu = new JMenu("submenu");
      JMenuItem i1= new JMenuItem("item 1");
      JMenuItem i2= new JMenuItem("item 2");
      JMenuItem i3= new JMenuItem("item 3");
      JMenuItem i4= new JMenuItem("item 4");
      JMenuItem i5= new JMenuItem("item 5");
      menu.add(i1);
      menu.add(i2);
      menu.add(i3);
      submenu.add(i4);
      submenu.add(i5);
      menu.add(submenu);
      mb.add(menu);
      frame.setJMenuBar(mb);
         frame.setVisible(true);

    }
    
}
