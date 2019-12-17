import java.io.*;

public class MessageReceiver implements Runnable {

	private GUI gui;
	private BufferedReader br;
	
	public MessageReceiver(InputStream is){
		br = new BufferedReader(new InputStreamReader(is));
	}
	
	public void setGUI(GUI gui){ this.gui = gui; }
	
	public void run(){
		receive();
	}
	
	
	public void receive(){
		String msg;
		while(true){
			try {
				msg = br.readLine();
				gui.addText(msg);
			} catch (IOException e) {
				break;
			}
		}
	}
	
}
