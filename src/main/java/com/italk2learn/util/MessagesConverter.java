package com.italk2learn.util;

import java.util.HashMap;

public class MessagesConverter {
	
	private HashMap<String, String> messages= new HashMap<String, String>();
	
	public MessagesConverter() {
		
		//English
		messages.put("Make a fraction that is equivalent to 3/4, using rectangles. Check it is equivalent to 3/4, by using the 'Compare' box.","Make a fraction that is equivalent to three quarters, using rectangles. Check it is equivalent to three quarters, by using the compare box.");
		messages.put("Make a fraction that is equivalent to 3/4, using number lines. Check it is equivalent to 3/4, by using the 'Compare' box.","Make a fraction that is equivalent to three quarters, using number lines. Check it is equivalent to three quarters, by using the compare box.");
		messages.put("Make a fraction that is equivalent to 3/4, using sets. Check it is equivalent to 3/4, by using the 'Compare' box.","Make a fraction that is equivalent to three quarters, using sets. Check it is equivalent to three quarters, by using the compare box.");
		messages.put("Make a fraction that is equivalent to 3/4, using liquid measures. Check it is equivalent to 3/4, by using the 'Compare' box.","Make a fraction that is equivalent to three quarters, using liquid measures. Check it is equivalent to three quarters, by using the compare box.");
		messages.put("Michael says '3/4 = 1/12 because 3 times 4 equals 12'.  By using the 'Compare' box, show why you agree or disagree.","Michael says three quarters equals one twelfth because three times four equals twelve. By using the compare box, show why you agree or disagree.");
		messages.put("Sam says '2/5 = 1/10 because 2 times 5 equals 10'.  By using the 'Compare' box, show why you agree or disagree.","Sam says two fifths equals one tenth because two times five equals ten. By using the compare box, show why you agree or disagree.");
		messages.put("Amir says '7/3 = 1/21 because 7 times 3 equals 21'.  By using the 'Compare' box, show why you agree or disagree.","Amir says seven thirds equals one twenty oneth because seven times three equals twentyone. By using the compare box, show why you agree or disagree.");
		messages.put("Make a fraction that equals 3/4 and has 12 as denominator. Check it is equivalent to 3/4, by using the 'Compare' box.","Make a fraction that equals three quarters and has twelve as denominator. Check it is equivalent to three quarters, by using the compare box.");
		
		//German
		messages.put("Bitte lies die Aufgabe erneut. Was sollst du hier tun?","");
		messages.put("Du gibst dir sehr viel M�he! Das ist sehr gut!","");
		messages.put("Lies die Aufgabe erneut und erkl�re, wie du vorgehst, um die Aufgabe zu l�sen.","");
		messages.put("Lies die Aufgabe erneut und erkl�re, wie du vorgehst, um die Aufgabe zu l�sen.","");
		messages.put("Bitte lies die Aufgabe noch einmal gr�ndlich durch.","");
		messages.put("Lies die Aufgabe erneut und pr�fe deinen Bruch.","");
		messages.put("Du brauchst zwei Br�che, um die Aufgabe zu bearbeiten: Zum einen brauchst du den Bruch  und zum anderen einen Bruch, der wertgleich zu  ist und  im Nenner stehen hat.","");
		messages.put("Wie kannst du in Fractions Lab pr�fen, ob deine L�sung richtig ist?","");
		messages.put("Wenn du mehr Hilfe ben�tigst, um die Aufgabe zu bearbeiten, dann frage deinen Lehrer.","");
		messages.put("Bitte lies die Aufgabe noch einmal gr�ndlich durch.","");
		messages.put("Lies die Aufgabe erneut und pr�fe dann deinen Bruch.","");
		messages.put("Wie kannst du in Fractions Lab pr�fen, ob deine L�sung richtig ist?","");
		messages.put("Sieh dir die Aufgabe an und �berlege dir, welchen weiteren Bruch du brauchst, um ihn mit deinem Bruch zu vergleichen.","");
		messages.put("Bitte lies die Aufgabe noch einmal gr�ndlich durch.","");
		messages.put("Lies die Aufgabe erneut und pr�fe deinen Bruch.","");
		messages.put("Bitte gebrauche f�r beide Br�che dasselbe Bilddiagramm (z.B. beides Mal ein Rechteck benutzen).","");
		messages.put("Wie kannst du in Fractions Lab pr�fen, ob deine L�sung richtig ist?","");
		messages.put("Bitte erkl�re, warum du zustimmst, oder warum nicht.","");
		messages.put("Bitte lies die Aufgabe noch einmal gr�ndlich durch.","");
		messages.put("Lies die Aufgabe erneut und pr�fe deinen Bruch.","");
		messages.put("Ver�ndere jetzt den Z�hler. Denke daran, dass du zwei Br�che erstellen musst, die addiert  ergeben.","");
		messages.put("Du musst nun einen zweiten Bruch erstellen, der addiert mit deinem ersten Bruch so viel ergibt, wie der Bruch im Aufgabentext.","");
		messages.put("�berlege dir, wie Br�che addiert werden. Was muss gleich sein, und was wird addiert?","");
		messages.put("Um zwei Br�che  zu addieren, m�ssen die Nenner gleich sein. Dann addierst du die Z�hler.","");
		messages.put("Wie kannst du in Fractions Lab pr�fen, ob deine L�sung richtig ist?","");
		messages.put(" �berlege dir einen Bruch und stelle ihn als Zahlenstrahl, Rechteck, Messbecher und Form (z.B. Stern, Herz, Mond) dar.","");
		messages.put("Erstelle einen Bruch, der wertgleich zum Bruch 7/3 ist. Benutze daf�r den Messbecher. Pr�fe, ob dein Bruch wertgleich zum Bruch 7/3 ist, indem du die Vergleichsfunktion (am Rand oben) nutzt.","");
		messages.put("Erstelle einen Bruch, der wertgleich zum Bruch 1/2 ist. Benutze daf�r Messbecher. Pr�fe, ob dein Bruch wertgleich zum Bruch 1/2 ist, indem du die Vergleichsfunktion (am Rand oben) nutzt.","");
		messages.put("Erstelle einen Bruch, der wertgleich zum Bruch 3/4 ist. Benutze daf�r Messbecher. Pr�fe, ob dein Bruch wertgleich zum Bruch 3/4 ist, indem du die Vergleichsfunktion (am Rand oben) nutzt.","");
		messages.put("Erstelle einen Bruch, der wertgleich zum Bruch 7/3 ist. Benutze daf�r Messbecher. Pr�fe, ob dein Bruch wertgleich zum Bruch 7/3 ist, indem du die Vergleichsfunktion (am Rand oben) nutzt.","");
		messages.put("Michael sagt: '3/4 = 1/12, weil 3 mal 4 ergibt 12.' Zeige mithilfe der Vergleichsfunktion (am Rand oben), ob du Michael zustimmst oder nicht.","");
		messages.put("Anna sagt: '2/5 = 1/10, weil 2 mal 5 ergibt 10.' Zeige mithilfe der Vergleichsfunktion (am Rand oben), ob du Michael zustimmst oder nicht.","");
		messages.put("Amir sagt: '7/3 = 1/21, weil 7 mal 3 ergibt 21.' Zeige mithilfe der Vergleichsfunktion (am Rand oben), ob du Michael zustimmst oder nicht.","");
	}
	
	public HashMap<String, String> getMessages() {
		return messages;
	}

	public void setMessages(HashMap<String, String> messages) {
		this.messages = messages;
	}

	
}
