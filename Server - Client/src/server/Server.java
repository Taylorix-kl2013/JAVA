package server;
/*****************************************************************
 * Datei:     Server.java
 * Verfasser: Marc Gottschall
 * Version:   1.2
 * Datum:     12.12.13
 * 
 * Letzte Änderungen
 * - Kommentare überarbeitet
 * - Dokumentation mit <code>javadocs</code> erstellt(\Server - Client incl. Doku (MG)\doc)
 * - Nachricht kann jetzt vom Benutzer eingegeben werden 
 * - Datum bei Ausgabe der Nachricht auf dem Server eingefügt 
 * - Kommentare eingefügt
 **************************************************************** */


/**Hier werden die benötigten Klassen importiert */
import java.io.BufferedReader;																// liest den Text aus einem Eingabestream und speichert die Zeichen in einen Buffer.
import java.io.IOException;																	// signalisiert Ein-/Ausgabefehler
import java.io.InputStreamReader;															// wandelt byte Streams in char-Streams
import java.io.OutputStreamWriter;															// wandelt char Streams in byte-Streams
import java.io.PrintWriter;																	// schreibt eine formatierten Text in den Ausgabe-Stream
import java.util.Calendar;																	// erzeugt Timestamps

 


/**
 * Diese Klasse enthält einen Konstruktor der die Variablen initialisiert. 
 * Weiterhin enthält sie die Methode <code>starten</code> die zum starten des Servers genutzt wird.
 */
public class Server {
	
	// Variablen-Deklaration
	
	
	/** speichert eine vom Client erhaltene Nachricht.vom Typ String. */
	static String nachricht;
	
	/** speichert eine Nachricht vom Inputstream zwischen.vom Typ Char Array. */
	static char[] buffer;
		
	/** vom Typ Integer zur Speicherung der Länge der gesandten Nachricht. wird zur Eingabeüberprüfung benötigt. */
	static int anzahlZeichen;
	

	
	
	// Deklaration der Objekte 
	
	
	/** 
	 * 	Liest den Text aus einem Eingabestream und speichert die Zeichen in einen Buffer.
	 * 	Ein Objekt der Klasse <code>BufferedReader</code>. 
	 */
	protected BufferedReader bufferedReader;
	
	/**
	 * liest die Nachricht aus dem Input-Stream und speichert ihn zwischen.
	 * Ein Objekt der Klasse <code>Printwriter</code>. 
	 */
	protected static PrintWriter printWriter;
	
	/**
	 * implementiert Client Sockets.
	 * Ein Objekt der Klasse <code>Socket</code>.
	 */
	protected java.net.Socket client;
	
	/**
	 * Implementiert Server Sockets.
	 * Ein Objekt der Klasse <code>ServerSocket</code>. 
	 */
	protected java.net.ServerSocket serverSocket;
	
	
	
	
	/**
	 * initialisiert die Variablen  -> <code>nachricht,port, serverSocket, client</code>
	 * 
	 * @see 	Main#main(String[])		wird in Methode <code>senden</code> aufgerufen
	 * @throws	IOException				signalisiert Ein-/Ausgabefehler
	 * */
    public Server() throws IOException {
    	final int 		port = 11111;
    	nachricht = "";
    	client = new java.net.Socket();
    	serverSocket = new java.net.ServerSocket(port);
        System.out.println("Empfangene Nachrichten: "); 
    }    
  
    
    
    
    /**
     * Diese Methode startet den Server und wartet bis eine Nachricht von einem Client eintrifft, weiterhin prüft sie die 
     * Nachricht auf Restriktionen(max. 200 Zeichen)gibt die Nachricht auf dem Bildschirm aus und sendet zur Bestätigung 
     * an den Client die empfangene Nachricht oder bei falscher Eingabe eine Fehlermeldung
     * @see 	Main#main(String[])		wird in der Hauptklasse aufgerufen
     * @throws 	IOException				signalisiert Ein-/Ausgabefehler
     * */
	public void starten() throws IOException {
		client = serverSocket.accept();													// wartet auf eingehende Verbindung am Server Socket und akzeptiert sie
		
		bufferedReader =
				new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
		
		buffer = new char[220];
		
		anzahlZeichen = bufferedReader.read(buffer, 0, 220);      						//blockiert bis Nachricht empfangen
		
		if (anzahlZeichen <= 200){ 														//Eingabeüberprüfung -> wenn korrekt dann Ausgabe und Bestätigung an Client  
			nachricht = new String(buffer, 0, anzahlZeichen);
			System.out.println(Calendar.getInstance().getTime() + " - " + nachricht);	//Ausgabe der Nachricht des Clients auf dem Server
			printWriter =	new PrintWriter												//Nachricht wird zur Bestätigung an den Client zurück gesandt
					(new OutputStreamWriter
							(client.getOutputStream()));
			printWriter.print(nachricht);
			printWriter.flush();
			} 
		else { 																			// falls die Eingabe zu lang war wird eine Fehlermeldung an den Client gesandt
			nachricht = "Ihre eingegebene Nachricht ist zu lang. (max. 200 Zeichen)"; 
			printWriter =																
					new PrintWriter(
							new OutputStreamWriter(
									client.getOutputStream()));
			printWriter.print(nachricht);
			printWriter.flush();
			}
		}
	
	
	
	
	}