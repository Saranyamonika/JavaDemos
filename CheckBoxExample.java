import javax.swing.JFrame;
import javax.swing.JCheckBox;
public class CheckBoxExample
{
public static void main(String[] args)
{
JFrame f=new JFrame();
JCheckBox c1=new JCheckBox("C++");
JCheckBox c2=new JCheckBox("JAVA");
c1.setBounds(10,30,200,200);
c2.setBounds(20,30,200,300);
f.add(c1);
f.add(c2);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}
}