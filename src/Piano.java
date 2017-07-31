import javazoom.jl.player.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Piano {
	
	public static int whiteSpace = 300;
	public static int noteGap = 250;
	public static int harshness = 4;
	public static String[] notes = new String[1500];
	public static int notesLen=0;
	
	private static String A1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.A1.mp3";
	private static String A2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.A2.mp3";
	private static String A3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.A3.mp3";
	private static String A4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.A4.mp3";
	private static String A5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.A5.mp3";
	private static String A6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.A6.mp3";
	private static String A7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.A7.mp3";
	private static String Ab1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Ab1.mp3";
	private static String Ab2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Ab2.mp3";
	private static String Ab3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Ab3.mp3";
	private static String Ab4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Ab4.mp3";
	private static String Ab5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Ab5.mp3";
	private static String Ab6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Ab6.mp3";
	private static String Ab7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Ab7.mp3";
	private static String B0 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B0.mp3";
	private static String B1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B1.mp3";
	private static String B2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B2.mp3";
	private static String B3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B3.mp3";
	private static String B4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B4.mp3";
	private static String B5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B5.mp3";
	private static String B6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B6.mp3";
	private static String B7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.B7.mp3";
	private static String Bb0 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb0.mp3";
	private static String Bb1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb1.mp3";
	private static String Bb2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb2.mp3";
	private static String Bb3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb3.mp3";
	private static String Bb4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb4.mp3";
	private static String Bb5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb5.mp3";
	private static String Bb6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb6.mp3";
	private static String Bb7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Bb7.mp3";
	private static String C1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C1.mp3";
	private static String C2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C2.mp3";
	private static String C3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C3.mp3";
	private static String C4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C4.mp3";
	private static String C5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C5.mp3";
	private static String C6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C6.mp3";
	private static String C7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C7.mp3";
	private static String C8 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.C8.mp3";
	private static String D1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.D1.mp3";
	private static String D2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.D2.mp3";
	private static String D3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.D3.mp3";
	private static String D4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.D4.mp3";
	private static String D5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.D5.mp3";
	private static String D6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.D6.mp3";
	private static String D7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.D7.mp3";
	private static String Db1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Db1.mp3";
	private static String Db2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Db2.mp3";
	private static String Db3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Db3.mp3";
	private static String Db4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Db4.mp3";
	private static String Db5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Db5.mp3";
	private static String Db6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Db6.mp3";
	private static String Db7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Db7.mp3";
	private static String E1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.E1.mp3";
	private static String E2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.E2.mp3";
	private static String E3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.E3.mp3";
	private static String E4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.E4.mp3";
	private static String E5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.E5.mp3";
	private static String E6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.E6.mp3";
	private static String E7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.E7.mp3";
	private static String Eb1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Eb1.mp3";
	private static String Eb2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Eb2.mp3";
	private static String Eb3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Eb3.mp3";
	private static String Eb4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Eb4.mp3";
	private static String Eb5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Eb5.mp3";
	private static String Eb6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Eb6.mp3";
	private static String Eb7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Eb7.mp3";
	private static String F1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.F1.mp3";
	private static String F2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.F2.mp3";
	private static String F3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.F3.mp3";
	private static String F4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.F4.mp3";
	private static String F5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.F5.mp3";
	private static String F6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.F6.mp3";
	private static String F7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.F7.mp3";
	private static String G1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.G1.mp3";
	private static String G2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.G2.mp3";
	private static String G3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.G3.mp3";
	private static String G4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.G4.mp3";
	private static String G5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.G5.mp3";
	private static String G6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.G6.mp3";
	private static String G7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.G7.mp3";
	private static String Gb1 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Gb1.mp3";
	private static String Gb2 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Gb2.mp3";
	private static String Gb3 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Gb3.mp3";
	private static String Gb4 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Gb4.mp3";
	private static String Gb5 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Gb5.mp3";
	private static String Gb6 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Gb6.mp3";
	private static String Gb7 = "C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Piano.pp.Gb7.mp3";
	
	public static String[] A = {"",A1,A2,A3,A4,A5,A6,A7};
	public static String[] Ab = {"",Ab1,Ab2,Ab3,Ab4,Ab5,Ab6,Ab7};
	public static String[] B = {B0,B1,B2,B3,B4,B5,B6,B7};
	public static String[] Bb = {Bb0,Bb1,Bb2,Bb3,Bb4,Bb5,Bb6,Bb7};
	public static String[] C = {"",C1,C2,C3,C4,C5,C6,C7,C8};
	public static String[] D = {"",D1,D2,D3,D4,D5,D6,D7};
	public static String[] Db = {"",Db1,Db2,Db3,Db4,Db5,Db6,Db7};
	public static String[] E = {"",E1,E2,E3,E4,E5,E6,E7};
	public static String[] Eb = {"",Eb1,Eb2,Eb3,Eb4,Eb5,Eb6,Eb7};
	public static String[] F = {"",F1,F2,F3,F4,F5,F6,F7};
	public static String[] G = {"",G1,G2,G3,G4,G5,G6,G7};
	public static String[] Gb = {"",Gb1,Gb2,Gb3,Gb4,Gb5,Gb6,Gb7};

	public static void main(String args[])
	{
		System.out.println("Enter the value of harshness: ");
		java.util.Scanner s = new java.util.Scanner(System.in);
		harshness = s.nextInt();
		parseInput();
		for(int i=0;i<notesLen;i++){
			System.out.print(notes[i]);
		}
		System.out.println("\n\n");
		System.out.println("Playing...");
		audioPlay();
	}
	
	public static void audioPlay(){
		for(int i =0;i<notesLen;i++)
		{	
			if(notes[i].equals(" ") || notes[i].equals("\n")){
				continue;
			}else if(notes[i].equals("A")){
				playAudio(A[harshness]);
			}else if(notes[i].equals("B")){
				playAudio(B[harshness]);
			}else if(notes[i].equals("C")){
				playAudio(C[harshness]);
			}else if(notes[i].equals("D")){
				playAudio(D[harshness]);
			}else if(notes[i].equals("E")){
				playAudio(E[harshness]);
			}else if(notes[i].equals("F")){
				playAudio(F[harshness]);
			}else if(notes[i].equals("G")){
				playAudio(G[harshness]);
			}else if(notes[i].equals("Ab")){
				playAudio(Ab[harshness]);
			}else if(notes[i].equals("Bb")){
				playAudio(Bb[harshness]);
			}else if(notes[i].equals("Db")){
				playAudio(Db[harshness]);
			}else if(notes[i].equals("Eb")){
				playAudio(Eb[harshness]);
			}else if(notes[i].equals("Gb")){
				playAudio(Gb[harshness]);
			}else{
				if(notes[i].contains("+")){
					String main_note[] = notes[i].split("\\+"); 
					int count = counter(notes[i],'+');
					if(main_note[0].equals("A")){
						playAudio(A[harshness+count]);
					}else if(main_note[0].equals("B")){
						playAudio(B[harshness+count]);
					}else if(main_note[0].equals("C")){
						playAudio(C[harshness+count]);
					}else if(main_note[0].equals("D")){
						playAudio(D[harshness+count]);
					}else if(main_note[0].equals("E")){
						playAudio(E[harshness+count]);
					}else if(main_note[0].equals("F")){
						playAudio(F[harshness+count]);
					}else if(main_note[0].equals("G")){
						playAudio(G[harshness+count]);
					}else if(main_note[0].equals("Ab")){
						playAudio(Ab[harshness+count]);
					}else if(main_note[0].equals("BB")){
						playAudio(Bb[harshness+count]);
					}else if(main_note[0].equals("Db")){
						playAudio(Db[harshness+count]);
					}else if(main_note[0].equals("Eb")){
						playAudio(Eb[harshness+count]);
					}else if(main_note[0].equals("Gb")){
						playAudio(Gb[harshness+count]);
					}
				}else if(notes[i].contains("-")){
					String main_note[] = notes[i].split("-");
					int count = counter(notes[i],'-');
					if(main_note[0].equals("A")){
						playAudio(A[harshness-count]);
					}else if(main_note[0].equals("B")){
						playAudio(B[harshness-count]);
					}else if(main_note[0].equals("C")){
						playAudio(C[harshness-count]);
					}else if(main_note[0].equals("D")){
						playAudio(D[harshness-count]);
					}else if(main_note[0].equals("E")){
						playAudio(E[harshness-count]);
					}else if(main_note[0].equals("F")){
						playAudio(F[harshness-count]);
					}else if(main_note[0].equals("G")){
						playAudio(G[harshness-count]);
					}else if(main_note[0].equals("Ab")){
						playAudio(Ab[harshness-count]);
					}else if(main_note[0].equals("BB")){
						playAudio(Bb[harshness-count]);
					}else if(main_note[0].equals("Db")){
						playAudio(Db[harshness-count]);
					}else if(main_note[0].equals("Eb")){
						playAudio(Eb[harshness-count]);
					}else if(main_note[0].equals("Gb")){
						playAudio(Gb[harshness-count]);
					}
				}
			}
			try {
				Thread.sleep(noteGap);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	private static int counter(String s, char x){
		int counter = 0;
		for( int i=0; i<s.length(); i++ ) {
		    if( s.charAt(i) == x ) {
		        counter++;
		    }
		}
		return counter;
	}
	
	public static void parseInput()
	{
		System.out.println("Parsing the key notes file...");
		System.out.println("Please wait...");
		File f = new File("C:\\Users\\Kousthubha\\Desktop\\PianoKeys\\Pirate.txt");
		try {
			java.util.Scanner s = new java.util.Scanner(new BufferedReader(new FileReader(f)));
			while(s.hasNext()){
				String node = s.nextLine();
				char[] note = node.toCharArray();
				for(int i=0;i<note.length;i++){
					if(note[i]=='+' || note[i]=='-'){
						notesLen--;
						notes[notesLen] = notes[notesLen].concat(Character.toString(note[i]));
						notesLen++;
					}else if(note[i]=='#'){
						notesLen--;
						notes[notesLen] = notes[notesLen].concat("b");
						notesLen++;
					}else{
						notes[notesLen]=Character.toString(note[i]);
						notesLen++;
					}
				}
				notes[notesLen] = "\n";
				notesLen++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Parsing completed successfully!");
		System.out.println("\n\n");
	}
	
	public static void playAudio(final String path)
	{
		new Thread(new Runnable(){
			public void run(){
				try{
		             FileInputStream fis = new FileInputStream(path);
		             Player playMP3 = new Player(fis);
		             playMP3.play();            
		        }  catch(Exception e){
		             System.out.println(e);
		        }
			}
		}).start();
	}
}
