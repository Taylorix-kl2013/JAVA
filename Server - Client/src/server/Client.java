package server;
/*****************************************************************
 * Datei:     Client.java
 * Verfasser: Marc Gottschall
 * Version:   1.2
 * Datum:     12.12.13
 * 
 * Letzte Änderungen
 * - Kommentare überarbeitet
 * - Dokumentation mit javadocs erstellt(\Server - Client incl. Doku (MG)\doc)
 * - Nachricht kann jetzt vom Benutzer eingegeben werden 
 * - Datum bei Ausgabe der Nachricht auf dem Server eingefügt 
 * - Kommentare eingefügt
 *
 **************************************************************** */

import java.io.BufferedReader;																	// liest den Text aus einem Eingabestream und speichert die Zeichen in einen Buffer.
import java.io.IOException;																		// signalisiert Ein-/Ausgabefehler
import java.io.InputStreamReader;																// wandelt byte Streams in char-Streams
import java.io.OutputStreamWriter;																// wandelt char Streams in byte-Streams
import java.io.PrintWriter;																		// schreibt eine formatierten Text in den Ausgabe-Stream
import java.util.Scanner;																		// wird zum einlesen der Benutzereingabe benötigt




/**
 * Diese Klasse erstellt einen Client der eine eingegebene Nachricht an einen Server sendet (hier an einen local host) 
 * und diese zur Bestätigung zurück erhält oder bei falscher Eingabe (zu viele Zeichen - maximal 200) eine Fehlermeldung 
 * erscheint.
 *  */
public class Client {
	
	
	/**
	 * liest die eingegebene Nachricht des Benutzers ein und sendet diese an den angegebenen Server.
	 * Zur Bestätigung erhält sie die empfangene Nachricht zurück oder eine Fehlermeldung bei falscher Eingabe
	 * und gibt diese auf dem Bildschirm aus
	 * 
	 * @throws IOException		signalisiert einen Ein-/Ausgabefehler
	 * */
	private void senden() throws IOException {
		String ip = "192.168.0.168"; 						   									// IP  des Servers
	    int port = 11111;																
	    String eingabe;																			
		Scanner scan1 = new Scanner(System.in);													
		System.out.print("Bitte geben Sie ihre Nachricht ein(max. 200 Zeichen): ");
		eingabe = scan1.nextLine();
		scan1.close();
	    java.net.Socket socket = new java.net.Socket(ip,port); 								
	    String zuSendendeNachricht = eingabe;												 
	    schreibeNachricht(socket, zuSendendeNachricht);
	    String empfangeneNachricht = leseNachricht(socket);										// liest Empfangsbestätigung/Fehlermeldung vom Server aus.
	    System.out.println("Vom Server zurück bekommene Nachricht: " + empfangeneNachricht);
	}
		
	

	
	/**
	 * sendet die vom Benutzer eingegebene Nachricht an den Ausgabe-Stream
	 *  
	 * @param socket        socket des Servers
	 * @param nachricht     eingegebene Nachricht des Benutzers
	 * @see #senden   		wird in Methode <code>senden</code> aufgerufen
	 * @throws IOException  signalisiert einen Ein-/Ausgabefehler
	 * */
	private static void schreibeNachricht(java.net.Socket socket, String nachricht) throws IOException{		
	     PrintWriter printWriter =
	        new PrintWriter(
	            new OutputStreamWriter(
	                socket.getOutputStream()));
	    printWriter.print(nachricht);
	    printWriter.flush();
	}
	
	
	
	
	/**
	 * empfängt die vom Server gesandte Bestätigung/Fehlermeldung vom Input-Stream
	 * @param socket socket des Servers
	 * @return <code>bufferedReader</code>	liest den Text aus einem Eingabestream und speichert die Zeichen in einen Buffer.
	 * @see #senden   			
	 *  */
	private static String leseNachricht(java.net.Socket socket) throws IOException {
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	    char[] buffer = new char[200];
	    int anzahlZeichen = bufferedReader.read(buffer, 0, 200); 							// blockiert bis Nachricht empfangen
	    String nachricht = new String(buffer, 0, anzahlZeichen);
	    return nachricht;
	}
	
	
	
	
	/** Ein neues Objekt der Klasse Client wird deklariert und die darin befindliche Methode senden wird aufgerufen
	 * 	
	 * 	@see #senden()
	 * */
	public static void main(String[] args) throws IOException { 
		Client client = new Client();														// Objekt der Klasse Client wird erzeugt
	    try{
	        client.senden();																	
	    } 
	    catch (IOException e) {																// signalisiert einen Ein-/Ausgabefehler
	        e.printStackTrace();															// gibt den Fehler aus mit Verweis auf den Standard Error-Stream 		   	
	    }
	}	    
 }