import javax.swing.*;
import java.net.*;
import java.awt.event.*;

 
public class ipaddress {
   
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(500,400);
        frame.setLayout(null);

        JLabel label = new JLabel(" Enter the URL ");
        label.setBounds(20,30,200,100);
        frame.add(label);
 
        JTextField textf = new JTextField();
        textf.setBounds(20,100,400,20);
        frame.add(textf);

        JButton b = new JButton("Press");
        b.setBounds(150,150,100,40);
        frame.add(b);
       
        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(20, 250, 400, 30);
        frame.add(resultLabel);


        b.addActionListener( new ActionListener() {
           public void actionPerformed(ActionEvent e){
             String url = textf.getText().trim();
             try {
                if(url.isEmpty()) {
                     throw new IllegalArgumentException("URL field is empty");
                }

                if ( url.startsWith("http://") || url.startsWith("https://"))
                   url = new URL(url).getHost();
                 

             InetAddress ip = InetAddress.getByName(url);
             resultLabel.setText("IP Address:" +ip.getHostAddress());
        
             } catch (UnknownHostException ex){
                resultLabel.setText("Error: Unable to resolve host ");
            } catch (MalformedURLException ex){
                resultLabel.setText("Error: Malformed URL");
            }catch(IllegalArgumentException ex){
                resultLabel.setText("Error: "+ex.getMessage());
            }catch (Exception ex){
                resultLabel.setText("Error: "+ ex.toString());
            }
        
        }
        } );


        frame.setVisible(true);
    }
}
