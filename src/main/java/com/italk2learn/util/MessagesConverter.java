package com.italk2learn.util;

import java.util.HashMap;
import java.util.Map;

public class MessagesConverter {
	
	private Map<String, String> messages= new HashMap<String, String>();
	
	public MessagesConverter() {
		
		//English
		messages.put(normaliseString("Make a fraction that is equivalent to 3/4, using rectangles. Check it is equivalent to 3/4, by using the 'Compare' box."),"Make a fraction that is equivalent to three quarters, using rectangles. Check it is equivalent to three quarters, by using the compare box.");
		messages.put(normaliseString("Make a fraction that is equivalent to 3/4, using number lines. Check it is equivalent to 3/4, by using the 'Compare' box."),"Make a fraction that is equivalent to three quarters, using number lines. Check it is equivalent to three quarters, by using the compare box.");
		messages.put(normaliseString("Make a fraction that is equivalent to 3/4, using sets. Check it is equivalent to 3/4, by using the 'Compare' box."),"Make a fraction that is equivalent to three quarters, using sets. Check it is equivalent to three quarters, by using the compare box.");
		messages.put(normaliseString("Make a fraction that is equivalent to 3/4, using liquid measures. Check it is equivalent to 3/4, by using the 'Compare' box."),"Make a fraction that is equivalent to three quarters, using liquid measures. Check it is equivalent to three quarters, by using the compare box.");
		messages.put(normaliseString("Michael says '3/4 = 1/12 because 3 times 4 equals 12'.  By using the 'Compare' box, show why you agree or disagree."),"Michael says three quarters equals one twelfth because three times four equals twelve. By using the compare box, show why you agree or disagree.");
		messages.put(normaliseString("Sam says '2/5 = 1/10 because 2 times 5 equals 10'.  By using the 'Compare' box, show why you agree or disagree."),"Sam says two fifths equals one tenth because two times five equals ten. By using the compare box, show why you agree or disagree.");
		messages.put(normaliseString("Amir says '7/3 = 1/21 because 7 times 3 equals 21'.  By using the 'Compare' box, show why you agree or disagree."),"Amir says seven thirds equals one twenty oneth because seven times three equals twentyone. By using the compare box, show why you agree or disagree.");
		messages.put(normaliseString("Make a fraction that equals 3/4 and has 12 as denominator. Check it is equivalent to 3/4, by using the 'Compare' box."),"Make a fraction that equals three quarters and has twelve as denominator. Check it is equivalent to three quarters, by using the compare box.");
		
		//German
		messages.put(normaliseString("Wie willst du diese Aufgabe bearbeiten?"),"Wie willst du diese Aufgabe bearbeiten?");
		messages.put(normaliseString("Lies die Aufgabe erneut und erkläre, wie du vorgehst, um die Aufgabe zu lösen."),"Liies die Aufgabe erneut und erkläre, wie du vorgehst, um die Aufgabe zu lösen.");
		messages.put(normaliseString("Was musst du in dieser Aufgabe machen?"),"Was musst du in dieser Aufgabe machen?");
		messages.put(normaliseString("Du kannst  auf die Symbolleiste für Bilddiagramme (am Rand rechts) klicken, um einen Bruch zu erstellen."),"Du kannst  auf die Sümmbohlleiste für Bilddiagramme (am Rand rechts) klicken, um einen Bruch zu erstellen.");
		messages.put(normaliseString("Lies die Aufgabe erneut und erkläre, wie du vorgehst, um die Aufgabe zu lösen."),"Liies die Aufgabe erneut und erkläre, wie du vorgehst, um die Aufgabe zu lösen.");
		messages.put(normaliseString("Gut gemacht. Was musst du jetzt tun, um den Bruch zu erstellen?"),"Gut gemacht. Was musst du jetzt tun, um den Bruch zu erstellen?");
		messages.put(normaliseString("Du kannst die Pfeile benutzen, um den Bruch zu verändern."),"Du kannst die Pfeile benutzen, um den Bruch zu verändern.");
		messages.put(normaliseString("Klicke jetzt auf den 'nach oben' Pfeil neben dem Bruch, um den Nenner zu bestimmen."),"Klicke jetzt auf den 'nach oben' Pfeil neben dem Bruch, um den Nännähr zu bestimmen.");
		messages.put(normaliseString("Klicke auf den 'nach oben' Pfeil neben dem Bruch, um den Nenner (das was unten im Bruch steht)  +endDenominator+ zu erstellen."),"Klicke auf den 'nach oben' Pfeil neben dem Bruch, um den Nännähr (das was unten im Bruch steht)  +endDenominator+ zu erstellen.");
		messages.put(normaliseString("Ist der Nenner in deinem Bruch richtig?"),"Ist der Nännähr in deinem Bruch richtig?");
		messages.put(normaliseString("Klicke jetzt auf den 'nach oben' Pfeil neben dem  Bruch, um den Nenner zu verändern."),"Klicke jetzt auf den 'nach oben' Pfeil neben dem  Bruch, um den Nännähr zu verändern.");
		messages.put(normaliseString("Prüfe, ob der Nenner in deinem Bruch richtig ist."),"Prüfe, ob der Nännähr in deinem Bruch richtig ist.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Erinnere dich: Der Nenner steht unten im Bruch."),"Erinnere dich: Der Nännähr steht unten im Bruch.");
		messages.put(normaliseString("Prüfe, ob du den Nenner und nicht den Zähler verändert hast."),"Prüfe, ob du den Nännähr und nicht den Zählehr verändert hast.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Erinnere dich: Der Nenner steht unten im Bruch."),"Erinnere dich: Der Nännähr steht unten im Bruch.");
		messages.put(normaliseString("Überprüfe, ob du den Nenner, und nicht den Zähler verändert hast."),"Üüberprüfe, ob du den Nännähr, und nicht den Zählehr verändert hast.");
		messages.put(normaliseString("Ist das der Bruch, den du machen wolltest?"),"Ist das der Bruch den du machen wolltest?");
		messages.put(normaliseString("Bitte lies die Aufgabe noch einmal gründlich durch."),"Bitte liies die Aufgabe noch einmal gründlich durch.");
		messages.put(normaliseString("Lies die Aufgabe erneut und prüfe deinen Bruch."),"Liies die Aufgabe erneut und prüfe deinen Bruch.");
		messages.put(normaliseString("Sehr gut! Bitte erkläre was Zähler und Nenner sind."),"Sehr gut! Bitte erkläre was Zählehr und Nännähr sind.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Der Nenner ist der untere Teil des Bruchs."),"Der Nännähr ist der untere Teil des Bruchs.");
		messages.put(normaliseString("Du hast den Zähler verändert. Du musst jedoch den Nenner verändern."),"Du hast den Zählehr verändert. Du musst jedoch den Nännähr verändern.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Der Nenner ist der untere Teil des Bruchs."),"Der Nännähr ist der untere Teil des Bruchs.");
		messages.put(normaliseString("Du hast den Zähler verändert. Du musst jedoch den Nenner verändern."),"Du hast den Zählehr verändert. Du musst jedoch den Nännähr verändern.");
		messages.put(normaliseString("Sehr gut! Wie veränderst du den Zähler?"),"Sehr gut! Wie verändeerßt du den Zählehr?");
		messages.put(normaliseString("Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zähler des Bruchs (das was oben steht) verändern."),"Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zählehr des Bruchs (das was oben steht) verändern.");
		messages.put(normaliseString("Du hast den Nenner verändert. Jetzt musst du den Zähler verändern."),"Du hast den Nännähr verändert. Jetzt musst du den Zählehr verändern.");
		//messages.put(normaliseString("Verändere jetzt den Zähler. Denke daran: Du sollst einen Bruch erstellen, der wertgleich zu dem Bruch "+startNumerator+"/"+startDenominator+" ist."),"Verändeere jetzt den Zählehr. Denke daran: Du sollst einen Bruch erstellen, der wertgleich zu dem Bruch "+startNumerator+"/"+startDenominator+" ist.");
		messages.put(normaliseString("Sehr gut! Wie willst du diesen Bruch jetzt vergleichen?"),"Sehr gut! Wie willst du diesen Bruch jetzt vergleichen?");
		messages.put(normaliseString("Jetzt hast du den ersten Bruch erstellt, vergleiche deinen ersten Bruch jetzt mit dem zweiten Bruch."),"Jetzt hast du den ersten Bruch erstellt. Vergleiche deinen ersten Bruch jetzt mit dem zweiten Bruch.");
		messages.put(normaliseString("Du musst diesen Bruch nun mit einem zweiten Bruch vergleichen."),"Du musst diesen Bruch nun mit einem zweiten Bruch vergleichen.");
		messages.put(normaliseString("Erstelle nun einen zweiten Bruch und stelle ihn mit dem gleichen Bilddiagramm dar."),"Erstelle nun einen zweiten Bruch und stelle ihn mit dem gleichen Bilddiagramm dar.");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Bruch nun vergleichen? "),"Sehr gut! Wie willst du diesen Bruch jetzt vergleichen?");
		messages.put(normaliseString("Jetzt hast du den ersten Bruch erstellt, vergleiche diesen jetzt mit dem zweiten Bruch."),"Jetzt hast du den ersten Bruch erstellt. Vergleiche deinen ersten Bruch jetzt mit dem zweiten Bruch.");
		messages.put(normaliseString("Du musst diesen Bruch nun mit einem zweiten Bruch vergleichen."),"Du musst diesen Bruch nun mit einem zweiten Bruch vergleichen.");
		messages.put(normaliseString("Erstelle nun einen zweiten Bruch und stelle ihn mit dem gleichen Bilddiagramm dar."),"Erstelle nun einen zweiten Bruch und stelle ihn mit dem gleichen Bilddiagramm dar.");
		messages.put(normaliseString("Sehr gut! Wie wirst du einen wertgleichen Bruch erstellen?"),"Sehr gut! Wie wirst du einen wertgleichen Bruch erstellen?");
		messages.put(normaliseString("Du könntest den Bruch kopieren und im Menü die Funktion 'Finde einen wertgleichen Bruch' benutzen, um einen wertgleichen Bruch zu finden. Klicke mit der rechten Maustaste auf deinen Bruch."),"Du könntest den Bruch kopieren und im Menü die Funktion 'Finde einen wertgleichen Bruch' benutzen, um einen wertgleichen Bruch zu finden. Klicke mit der rechten Mausstaste auf deinen Bruch.");
		messages.put(normaliseString("Sehr gut! Kopiere jetzt diesen Bruch und benutze im Menü die Funktion 'Finde einen wertgleichen Bruch', um deinen Bruch zu verändern. Klicke dazu mit der rechten Maustaste auf deinen Bruch."),"Sehr gut! Kopiere jetzt diesen Bruch und benutze im Menü die Funktion \"Finde einen wertgleichen Bruch\", um deinen Bruch zu verändern. Klicke dazu mit der rechten Mausstaste auf deinen Bruch.");
		messages.put(normaliseString("Warum hast du dich entschieden, ein anderes Bilddiagramm zu benutzen? Was sollst du in dieser Aufgabe machen?"),"Warum hast du dich ent schiehden, ein anderes Bilddiagramm zu benutzen?");
		messages.put(normaliseString("Bitte benutze das gleiche Bilddiagramm für den zweiten Bruch."),"Bitte benutze das gleiche Bilddiagramm für den zweiten Bruch.");
		messages.put(normaliseString("Bitte erstelle einen zweiten Bruch und benutze dafür das gleiche Bilddiagramm wie beim ersten Bruch."),"Bitte erstelle einen zweiten Bruch und benutze dafür das gleiche Bilddiagramm wie beim ersten Bruch.");
		//messages.put(normaliseString("Jetzt, da du den Bruch +endNumerator+"/"+endDenominator+" erstellt hast, wie willst du ihn mit "+startNumerator+"/"+startDenominator+" vergleichen?"),"Jetzt, da du den Bruch +endNumerator+"/"+endDenominator+" erstellt hast, );
//		messages.put(normaliseString("Sieh dir die Aufgabe an und überlege, welchen anderen Bruch du erstellen musst, um ihn mit "+endNumerator+"/"+endDenominator+" zu vergleichen." ,"Sieh dir die Aufgabe an und üh berlege, welchen anderen Bruch du ehr stellen musst, );
//		messages.put(normaliseString("Einer deiner Brüche muss "+startNumerator+"/"+startDenominator+" sein, damit du ihn mit "+endNumerator+"/"+endDenominator+" vergleichen kannst."),"Einer deiner Brüche muss "+startNumerator+"/"+startDenominator+" sein, );
//		messages.put(normaliseString("Behalte den Bruch "+endNumerator+"/"+endDenominator+". Verändere nun den anderen Bruch in "+startNumerator+"/"+startDenominator+". Vergleiche die Brüche mithilfe der Vergleichsfunktion (am Rand oben)."),"Behalte den Bruch "+endNumerator+"/"+endDenominator+". "Verändere nun den anderen Bruch in "+startNumerator+"/"+startDenominator+". "Vergleiche die Brüche mithilfe der Vergleichsfunktion (am Rand oben).");
//		messages.put(normaliseString("Wie kannst du einen Bruch erstellen, der "+endDenominator+" im Nenner hat und wertgleich zu "+startNumerator+"/"+startDenominator+" ist."),"Wie kannst du einen Bruch ehrstellen, der "+endDenominator+" im Nännähr hat und wertgleich zu "+startNumerator+"/"+startDenominator+" ist.");
//		messages.put(normaliseString("Sieh dir die Aufgabe an und überlege, welchen anderen Bruch du erstellen musst, um ihn mit "+startNumerator+"/"+startDenominator+" zu vergleichen."),"Sieh dir die Aufgabe an und üh berlege, welchen anderen Bruch du ehr stellen musst, um ihn mit "+endNumerator+"/"+endDenominator+" zu vergleichen.");
		//messages.put(normaliseString("Du brauchst zwei Brüche, um die Aufgabe zu bearbeiten: Zum einen brauchst du den Bruch  +startNumerator+"/"+startDenominator+" und zum anderen einen Bruch, der wertgleich zu +startNumerator+"/"+startDenominator+" ist und "+endDenominator+" im Nenner stehen hat."),"Du brauuchst zwei Brüche, um die Aufgabe zu bearbeiten: Zum einen brauuchst du den Bruch  +startNumerator+"/"+startDenominator+" und zum anderen einen Bruch, der wertgleich zu ist und im Nännähr stehen.);
		//messages.put(normaliseString("Behalte den Bruch "+startNumerator+"/"+startDenominator". Wandle jetzt den anderen Bruch in "+endNumerator+"/"+endDenominator" um. Vergleiche die Brüche mithilfe der Vergleichsfunktion (am Rand oben)."),"Behalte den Bruch "+startNumerator+"/"+startDenominator". Wandle jetzt den anderen Bruch in "+endNumerator+"/"+endDenominator" um. Vergleiche die Brüche mithilfe der Vergleichsfunktion (am Rand oben).");
		//messages.put(normaliseString("Wie könntest du deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen?"),"Wie könntest du deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen?");
		messages.put(normaliseString("Schaue dir die Nenner der beiden Brüche genau an. In welchem Verhältnis steht der Nenner des einen Bruchs zu dem Nenner des anderen Bruchs?"),"Schaue dir die Nännähr der beiden Brüche genau an. In welchem Verhältnis steht der Nännähr des einen Bruchs zu dem Nännähr des anderen Bruchs?");
		//messages.put(normaliseString("Um deinen Bruch mit "+startNumerator+"/"+startDenominator" vergleichen zu können, musst du zusätzlich zu deinem Bruch den Bruch "+startNumerator+"/"+startDenominator+" erstellen,  und die Vergleichsfunktion (am Rand oben) benutzen."),"Um deinen Bruch mit "+startNumerator+"/"+startDenominator" vergleichen zu können, musst du zusätzlich zu deinem Bruch den Bruch "+startNumerator+"/"+startDenominator+" erstellen, und die Vergleichsfunktion (am Rand oben) benutzen.");
		messages.put(normaliseString("Sehr gut! Wie willst du die Brüche mithilfe der Vergleichsfunktion (am Rand oben) vergleichen?"),"Sehr gut! Wie willst du die Brüche mithilfe der Vergleichsfunktion (am Rand oben) vergleichen?");
		messages.put(normaliseString("Du kannst die Brüche jetzt vergleichen. Öffne dazu die Vergleichsfunktion (am Rand oben)."),"Du kannst die Brüche jetzt vergleichen. Öffne dazu die Vergleichsfunktion (am Rand oben).");
		messages.put(normaliseString("Sehr gut! Benutze jetzt die Vergleichsfunktion."),"Sehr gut! Benutze jetzt die Vergleichsfunktion.");
		messages.put(normaliseString("Sehr gut! Öffne nun die Vergleichsfunktion (am Rand oben) und ziehe die beiden Brüche in den Kasten."),"Sehr gut! Öffne nun die Vergleichsfunktion (am Rand oben) und ziehe die beiden Brüche in den Kasten.");
		messages.put(normaliseString("Womit wirst du deinen Bruch vergleichen?"),"Womit wirst du deinen Bruch vergleichen?");
		messages.put(normaliseString("Bei wertgleichen Brüchen sind die Zähler und Nenner des einen Bruches das gleiche Vielfache des anderen Bruches."),"Bei wertgleichen Brüchen sind die Zählehr und Nännähr des einen Bruches das gleiche Vielfache des anderen Bruches.");
		//messages.put(normaliseString("Erstelle zuerst einen weiteren Bruch und zwar "+startNumerator+"/"+startDenominator+". Vergleiche dann die beiden Brüche."),"Erstelle zuerst einen weiteren Bruch und zwar "+startNumerator+"/"+startDenominator+". Vergleiche dann die beiden Brüche.");
		messages.put(normaliseString("Wie kannst du in Fractions Lab prüfen, ob deine Lösung richtig ist?"),"Wie kannst du in freckt schensläpp prüfen, ob deine Lösung richtig ist?");
		messages.put(normaliseString("Du könntest die Vergleichsfunktion benutzen, um deine Brüche zu vergleichen."),"Du könntest die Vergleichsfunktion benutzen, um deine Brüche zu vergleichen.");
		messages.put(normaliseString("Vergleiche die Brüche mithilfe der Vergleichsfunktion."),"Vergleiche die Brüche mithilfe der Vergleichsfunktion.");
		messages.put(normaliseString(" Sehr gut! Erkläre nun, warum du im Nenner 3 stehen hast."),"Sehr gut! Erkläre nun, warum du im Nännähr 3 stehen hast.");
		messages.put(normaliseString("Sehr gut! Was wirst du als nächstes tun?"),"Sehr gut! Was wirst du als nächstes tun?");
		messages.put(normaliseString("Das hast du dir gut erarbeitet! Toll gemacht!"),"Das hast du dir gut erarbeitet! Toll gemacht!");
		//messages.put(normaliseString("Bitte erkläre, was du mit dem Zähler und dem Nenner des Bruchs "+startNumerator+"/"+startDenominator+" gemacht hast, um einen wertgleichen Bruch mit "endDenominator+" im Nenner zu erstellen."),"Bitte erkläre, was du mit dem Zählehr und dem Nännähr des Bruchs "+startNumerator+"/"+startDenominator+" gemacht hast, um einen wertgleichen Bruch mit "+endDenominator+" im Nännähr zu ehr stellen.");
		messages.put(normaliseString("Was konntest du beobachten als du 1/3 und 1/5 verglichen hast. Erkläre bitte!"),"Was konntest du beobachten als du eindrittel und einfünftel verglichen hast. Erkläre bitte!");
		messages.put(normaliseString("Was ist mit Zähler und Nenner passiert? Ist mit beiden das gleiche passiert, oder etwas unterschiedliches?"),"Was ist mit Zählehr und Nännähr passiert? Ist mit beiden das gleiche passiert, oder etwas unter schied liches?");
		//messages.put(normaliseString("Warum hast du den Bruch "+endNumerator+"/"+endDenominator+" erstellt? Was hast du mit dem Zähler und dem Nenner von "+startNumerator+"/"+startDenominator+" gemacht?"),"Warum hast du den Bruch "+endNumerator+"/"+endDenominator+" erstellt? Was hast du mit dem Zählehr und dem Nännähr von "+startNumerator+"/"+startDenominator+" gemacht?");
		messages.put(normaliseString("Es sieht nicht so aus, als hättest du die Aufgabe bereits beendet."),"Es sieht nicht so aus, als hättest du die Aufgabe bereits beendet.");
		messages.put(normaliseString("Wenn du mehr Hilfe benötigst, um die Aufgabe zu bearbeiten, dann frage deinen Lehrer."),"Wenn du mehr Hilfe benotigst, um die Aufgabe zu bearbeiten, dann frage deinen Lehrer.");
		messages.put(normaliseString("Sehr gut! Wie stellt man Brüche mit einem anderen Bilddiagramm dar?"),"Sehr gut! Wie stellt man Brüche mit einem anderen Bilddiagramm dar?");
		messages.put(normaliseString("Sehr gut! Klicke nun auf die Schaltfläche für die Bilddiagramme und erstelle genau denselben Bruch mit einem anderen Bilddiagramm."),"Sehr gut! Klicke nun auf die Schaltfläche für die Bilddiagramme und erstelle genau denselben Bruch mit einem anderen Bilddiagramm.");
		messages.put(normaliseString("Sehr gut! Auf welche Weise sind die Bilddiagramme ähnlich und wo unterscheiden sie sich?"),"Sehr gut! Auf welche Weise sind die Bilddiagramme ähnlich und wo unterscheiden sie sich?");
		messages.put(normaliseString(" Sehr gut! Bist du mit der Aufgabe fertig?")," Sehr gut! Bist du mit der Aufgabe fertig?");
		messages.put(normaliseString("Sehr gut! Weiter so. Stelle nun deinen Bruch mit einem anderen Bilddiagramm dar."),"Sehr gut! Weiter so. Stelle nun deinen Bruch mit einem anderen Bilddiagramm dar.");
		messages.put(normaliseString("Sehr gut! Haben deine Brüche den gleichen Wert?"),"Sehr gut! Haben deine Brüche den gleichen Wert?");
		messages.put(normaliseString("Sehr gut! Verändere deine Brüche so, dass sie den gleichen Wert haben."),"Sehr gut! Ver ändeere deine Brüche so, dass sie den gleichen Wert haben.");
		messages.put(normaliseString("Sehr gut, du hast deinen Bruch mit allen Bilddiagrammen dargestellt. Gut gemacht."),"Sehr gut, du hast deinen Bruch mit allen Bilddiagrammen dargestellt. Gut gemacht.");
		messages.put(normaliseString("Sehr gut! Auf welche Weise sind die Bilddiagramme ähnlich und wo unterscheiden sie sich?") ,"Sehr gut! Auf welche Weise sind die Bilddiagramme ähnlich und wo unterscheiden sie sich?");
		messages.put(normaliseString("Gut gemacht. Was musst du jetzt in einem letzten Schritt tun, um den Bruch  zu erstellen?"),"Gut gemacht. Was musst du jetzt in einem letzten Schritt tun, um den Bruch  zu erstellen?");
		messages.put(normaliseString("Du kannst die Pfeile oben am Bruch benutzen, um den Bruch fertigzustellen."),"Du kannst die Pfeile oben am Bruch benutzen, um den Bruch fertigzustellen.");
		messages.put(normaliseString("Klicke jetzt auf den „nach oben\" Pfeil im oberen Teil des Bruches, um den Zähler zu bestimmen."),"Klicke jetzt auf den 'nach oben' Pfeil im oberen Teil des Bruches, um den Zählehr zu bestimmen.");
		messages.put(normaliseString("Klicke jetzt auf den „nach oben\" Pfeil im oberen Teil des Bruches, um den Zähler zu bestimmen (das was oben im Bruch steht)."),"Klicke jetzt auf den 'nach oben' Pfeil im oberen Teil des Bruches, um den Zählehr zu bestimmen (das was oben im Bruch steht).");
		messages.put(normaliseString("Sehr gut! Welchen Bruch hast du erstellt?"),"Sehr gut! Welchen Bruch hast du erstellt?");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Bruch zerteilen?"),"Sehr gut! Wie wirst du den Bruch zerteilen?");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in zwei Teile."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in zwei Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Teile den Bruch in zwei Teile."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Teile den Bruch in zwei Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Teile den Bruch in zwei Teile. Klicke, um den Bruch in zwei Teile zu teilen."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Klicke, um den Bruch in zwei Teile zu teilen.");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Bruch in 3 Teile teilen?"),"Sehr gut! Wie wirst du den Bruch in 3 Teile teilen?");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 3 Teile."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 3 Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 3 Teile.") ,"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 3 Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Klicke, um den Bruch in 3 Teile zu zerteilen.") ,"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Klicke, um den Bruch in 3 Teile zu zerteilen.");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Bruch in 4 Teile zerteilen?"),"Sehr gut! Wie wirst du den Bruch in 4 Teile zerteilen?");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 4 Teile."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 4 Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 4 Teile."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 4 Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Klicke, um den Bruch in 4 Teile zu zerteilen."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Klicke, um den Bruch in 4 Teile zu zerteilen.");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Bruch in 5 Teile zerteilen?"),"Sehr gut! Wie wirst du den Bruch in 5 Teile zerteilen?");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 5 Teile.") ,"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 5 Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'.  Zerteile den Bruch in 5 Teile."),"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Zerteile den Bruch in 5 Teile.");
		messages.put(normaliseString("Klicke mit der rechten Maustaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Klicke, um den Bruch in 5 Teile zu zerteilen.") ,"Klicke mit der rechten Mausstaste auf den Bruch und wähle im Menü 'Finde einen wertgleichen Bruch'. Klicke, um den Bruch in 5 Teile zu zerteilen.");
		messages.put(normaliseString("Sehr gut! Ist dein neuer Bruch nun wertgleich mit dem ursprünglichen Bruch? Was ist mit dem Nenner geschehen, und was ist mit dem Zähler geschehen?"),"Sehr gut! Ist dein neuer Bruch nun wertgleich mit dem ursprünglichen Bruch? Was ist mit dem Nännähr geschehen, und was ist mit dem Zählehr geschehen?");
		messages.put(normaliseString("Sehr gut! Bist du mit der Aufgabe fertig?"),"Sehr gut! Bist du mit der Aufgabe fertig?");
		messages.put(normaliseString("Weiter so! Jetzt zerteile den Bruch noch weiter."),"Weiter so! Jetzt zerteile den Bruch noch weiter.");
		messages.put(normaliseString("Sehr gut! Du hast den Bruch 2, 3, 4, und 5 Mal geteilt. Toll gemacht!"),"Sehr gut! Du hast den Bruch 2, 3, 4, und 5 Mal geteilt. Toll gemacht!");
		messages.put(normaliseString("Was ist mit Zähler und Nenner passiert, als du im Menü die Funktion \"Finde einen wertgleichen Bruch\" benutzt hast ?"),"Was ist mit Zählehr und Nännähr passiert, als du im Menü die Funktion \"Finde einen wertgleichen Bruch\" benutzt hast ?");
		messages.put(normaliseString("Ist der Nenner deines Bruches richtig?"),"Ist der Nännähr deines Bruches richtig?");
		messages.put(normaliseString("Du kannst auf den Pfeil neben deinem Bruch klicken, um ihn zu verändern."),"Du kannst auf den Pfeil neben deinem Bruch klicken, um ihn zu verändern.");
		messages.put(normaliseString("Prüfe ob der Nenner deines Bruchs richtig ist."),"Prüfe ob der Nännähr deines Bruchs richtig ist.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Denk daran: Der Nenner ist der untere Teil des Bruchs."),"Denk daran: Der Nännähr ist der untere Teil des Bruchs.");
		messages.put(normaliseString("Überprüfe, ob du den Nenner, und nicht den Zähler verändert hast."),"Überprüfe, ob du den Nännähr, und nicht den Zählehr verändert hast.");
		messages.put(normaliseString("Ist das der Bruch, den du machen wolltest?"),"Ist das der Bruch, den du machen wolltest?");
		messages.put(normaliseString("Bitte lies die Aufgabe noch einmal gründlich durch."),"Bitte lies die Aufgabe noch einmal gründlich durch.");
		messages.put(normaliseString("Lies die Aufgabe erneut und prüfe dann deinen Bruch."),"Lies die Aufgabe erneut und prüfe dann deinen Bruch.");
		messages.put(normaliseString("Sehr gut! Bitte erkläre was \"Zähler\" und \"Nenner\" sind."),"Sehr gut! Bitte erkläre was \"Zählehr\" und \"Nännähr\" sind.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Der Nenner ist der untere Teil des Bruchs."),"Der Nännähr ist der untere Teil des Bruchs.");
		messages.put(normaliseString("Du hast den Zähler verändert. Du musst jedoch den Nenner verändern."),"Du hast den Zählehr verändert. Du musst jedoch den Nännähr verändern.");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Zähler verändern?"),"Sehr gut! Wie wirst du den Zählehr verändern?");
		messages.put(normaliseString("Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zähler des Bruchs (das was oben steht) verändern."),"Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zählehr des Bruchs (das was oben steht) verändern.");
		messages.put(normaliseString("Du hast den Zähler verändert. Du musst jedoch den Nenner verändern."),"Du hast den Zählehr verändert. Du musst jedoch den Nännähr verändern.");
		//messages.put(normaliseString("Verändere jetzt den Zähler. Denke daran: Du sollst einen wertgleichen Bruch zum Bruch"+startNumerator+"/"+startDenominator+" erstellen."; ,"Verändere jetzt den Zählehr. Denke daran: Du sollst einen wertgleichen Bruch zum Bruch"+startNumerator+"/"+startDenominator+" erstellen.");
		messages.put(normaliseString("Sehr gut! Wie wirst du einen wertgleichen Bruch erstellen?"),"Sehr gut! Wie wirst du einen wertgleichen Bruch erstellen?");
		messages.put(normaliseString("Du könntest du den Bruch kopieren und im Menü auf 'Finde einen wertgleichen Bruch' auswählen, um einen wertgleichen Bruch zu finden."),"Du könntest du den Bruch kopieren und im Menü auf 'Finde einen wertgleichen Bruch' auswählen, um einen wertgleichen Bruch zu finden.");
		messages.put(normaliseString("Sehr gut! Kopiere jetzt diesen Bruch und benutze im Menü 'Finde einen wertgleichen Bruch', um deinen Bruch zu verändern."),"Sehr gut! Kopiere jetzt diesen Bruch und benutze im Menü 'Finde einen wertgleichen Bruch', um deinen Bruch zu verändern.");
		messages.put(normaliseString("Sehr gut! Klicke jetzt mit der rechten Maustaste auf den Bruch und kopiere ihn. Klicke danach mit der rechten Maustaste auf den kopierten Bruch und wähle im Menü 'Finde einen wertgleichen Bruch', um einen wertgleichen Bruch zu erstellen."),"Sehr gut! Klicke jetzt mit der rechten Mausstaste auf den Bruch und kopiere ihn. Klicke danach mit der rechten Mausstaste auf den kopierten Bruch und wähle im Menü 'Finde einen wertgleichen Bruch', um einen wertgleichen Bruch zu erstellen.");
		//messages.put(normaliseString("Wie könntest du deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen?"),"Wie könntest du deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen?");
		//messages.put(normaliseString("Achte auf den Nenner deines Bruchs und auf den Nenner des Bruchs  +startNumerator+/"+startDenominator. Welchen Zusammenhang kannst du zwischen den Brüchen erkennen? Was musst du mit "+startNumerator+" tun, um den richtigen Zähler für deinen Bruch zu finden?"),"Achte auf den Nenner deines Bruchs und auf den Nännähr des Bruchs   +startNumerator+/"+startDenominator. Welchen Zusammenhang kannst du zwischen den Brüchen erkennen? Was musst du mit "+startNumerator+" tun, um den richtigen Zählehr für deinen Bruch zu finden?");
		//messages.put(normaliseString("Vergleiche deinen Bruch mit "+startNumerator+"/"+startDenominator+" , indem du die Vergleichsfunktion (am Rand oben) benutzt."),"Vergleiche deinen Bruch mit "+startNumerator+"/"+startDenominator+" , indem du die Vergleichsfunktion (am Rand oben) benutzt.");
		messages.put(normaliseString("Mit welchem anderen Bruch willst du deinen Bruch vergleichen?"),"Mit welchem anderen Bruch willst du deinen Bruch vergleichen?");
		messages.put(normaliseString("Bei wertgleichen Brüchen sind die Zähler und Nenner des einen Bruches das (gleiche) Vielfache des anderen Bruches."),"Bei wertgleichen Brüchen sind die Zählehr und Nännähr des einen Bruches das (gleiche) Vielfache des anderen Bruches.");
		//messages.put(normaliseString("Erstelle zuerst einen weiteren Bruch, dieses Mal "+startNumerator+"/"+startDenominator+". Vergleiche dann deine beiden Brüche."),"Erstelle zuerst einen weiteren Bruch, dieses Mal "+startNumerator+"/"+startDenominator+". Vergleiche dann deine beiden Brüche.");
		messages.put(normaliseString("Wie kannst du in Fractions Lab prüfen, ob deine Lösung richtig ist?"),"Wie kannst du in  freckt schensläpp prüfen, ob deine Lösung richtig ist?");
		messages.put(normaliseString("Du könntest die Vergleichsfunktion (am Rand oben) benutzen, um deine Brüche zu vergleichen."),"Du könntest die Vergleichsfunktion (am Rand oben) benutzen, um deine Brüche zu vergleichen.");
		messages.put(normaliseString("Vergleiche die beiden Brüche, indem du die Vergleichsfunktion (am Rand oben) benutzt."),"Vergleiche die beiden Brüche, indem du die Vergleichsfunktion (am Rand oben) benutzt.");
		//messages.put(normaliseString("Jetzt, da du einen wertgleichen Bruch zu "+startNumerator+"/"+startDenominator+" erstellt hast, wie willst du ihn mit "+startNumerator+"/"+startDenominator+" vergleichen?"; ,"Jetzt, da du einen wertgleichen Bruch zu "+startNumerator+"/"+startDenominator+" erstellt hast, wie willst du ihn mit "+startNumerator+"/"+startDenominator+" vergleichen?");
		messages.put(normaliseString("Sieh dir die Aufgabe an und überlege, welchen anderen Bruch du erstellen musst, um ihn mit deinem Bruch zu vergleichen."),"Sieh dir die Aufgabe an und übärlähge, welchen anderen Bruch du erstellen musst, um ihn mit deinem Bruch zu vergleichen.");
		//messages.put(normaliseString("Um deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen zu können, musst du einen zweiten Bruch erstellen. Nimm dieses Mal "+startNumerator+"/"+startDenominator+"."; ,"Um deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen zu können, musst du einen zweiten Bruch erstellen. Nimm dieses Mal "+startNumerator+"/"+startDenominator+".");
		//messages.put(normaliseString("Behalte den Bruch, den du erstellt hast. Erstelle einen zweiten Bruch. Nimm dieses Mal  +startNumerator+/"+startDenominator+". Dann vergleich die Brüche mithilfe der Vergleichsfunktion"),"Behalte den Bruch, den du erstellt hast. Erstelle einen zweiten Bruch. Nimm dieses Mal  +startNumerator+/"+startDenominator+". Dann vergleich die Brüche mithilfe der Vergleichsfunktion");
		//messages.put(normaliseString("Jetzt, da du den Bruch +endNumerator+"/"+endDenominator+" erstellt hast, wie willst du ihn mit "+startNumerator+"/"+startDenominator+" vergleichen?"),"Jetzt, da du den Bruch +endNumerator+"/"+endDenominator+" erstellt hast, wie willst du ihn mit "+startNumerator+"/"+startDenominator+" vergleichen?");
		messages.put(normaliseString("Sieh dir die Aufgabe an und überlege dir, welchen weiteren Bruch du brauchst, um ihn mit deinem Bruch zu vergleichen."),"Sieh dir die Aufgabe an und  übärlähge dir, welchen weiteren Bruch du brauuchst, um ihn mit deinem Bruch zu vergleichen.");
		//messages.put(normaliseString("Um deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen zu können, musst du einen zweiten Bruch erstellen. Nimm dieses Mal "+startNumerator+"/"+startDenominator+"."),"Um deinen Bruch mit "+startNumerator+"/"+startDenominator+" vergleichen zu können, musst du einen zweiten Bruch erstellen. Nimm dieses Mal "+startNumerator+"/"+startDenominator+".");
		//messages.put(normaliseString("Behalte den Bruch, der wertgleich zu "+startNumerator+"/"+startDenominator+" ist. Wandle  nun den anderen Bruch in "+startNumerator+"/"+startDenominator+" um. Vergleiche die beiden Brüche dann mithilfe der Vergleichsfunktion."),"Behalte den Bruch, der wertgleich zu "+startNumerator+"/"+startDenominator+" ist. Wandle  nun den anderen Bruch in "+startNumerator+"/"+startDenominator+" um. Vergleiche die beiden Brüche dann mithilfe der Vergleichsfunktion.");
		messages.put(normaliseString("Das hast du dir gut erarbeitet! Toll gemacht!"),"Das hast du dir gut erarbeitet! Toll gemacht!");
		//messages.put(normaliseString("Bitte erkläre, was du mit dem Zähler und dem Nenner von "+startNumerator+"/"+startDenominator+" des Bruchs 3/4 gemacht hast, um einen wertgleichen Bruch zu erstellen."),"Bitte erkläre, was du mit dem Zählehr und dem Nännähr von "+startNumerator+"/"+startDenominator+" des Bruchs dreiviertel gemacht hast, um einen wertgleichen Bruch zu erstellen.");
		messages.put(normaliseString("Du kannst auf den Pfeil neben deinem Bruch klicken, um ihn zu verändern."),"Du kannst auf den Pfeil neben deinem Bruch klicken, um ihn zu verändern.");
		messages.put(normaliseString("Ist der Nenner in deinem Bruch richtig?"),"Ist der Nännähr in deinem Bruch richtig?");
		messages.put(normaliseString("Prüfe, ob der Nenner in deinem Bruch richtig ist."),"Prüfe, ob der Nännähr in deinem Bruch richtig ist.");
		messages.put(normaliseString("Denk daran: Der Nenner steht unten im Bruch."),"Denk daran: Der Nännähr steht unten im Bruch.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Überprüfe, ob du den Nenner, und nicht den Zähler verändert hast."),"Überprüfe, ob du den Nännähr, und nicht den Zählehr verändert hast.");
		messages.put(normaliseString("Bitte lies die Aufgabe noch einmal gründlich durch."),"Bitte lies die Aufgabe noch einmal gründlich durch.");
		messages.put(normaliseString("Ist das wirklich der Bruch, den du machen wolltest?"),"Ist das wirklich der Bruch, den du machen wolltest?");
		messages.put(normaliseString("Lies die Aufgabe erneut und prüfe deinen Bruch."),"Lies die Aufgabe erneut und prüfe deinen Bruch.");
		messages.put(normaliseString("Sehr gut! Bitte erkläre was \"Zähler\" und \"Nenner\" sind."),"Sehr gut! Bitte erkläre was \"Zählehr\" und \"Nännähr\" sind.");
		messages.put(normaliseString("Der Nenner ist der untere Teil des Bruchs."),"Der Nännähr ist der untere Teil des Bruchs.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Du hast den Zähler verändert. Du musst jedoch den Nenner verändern."),"Du hast den Zählehr verändert. Du musst jedoch den Nännähr verändern.");
		messages.put(normaliseString("Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zähler des Bruchs (das was oben steht) verändern."),"Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zählehr des Bruchs (das was oben steht) verändern.");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Zähler verändern?"),"Sehr gut! Wie wirst du den Zählehr verändern?");
		messages.put(normaliseString("Du hast den Nenner verändert. Jetzt musst du den Zähler verändern."),"Du hast den Nännähr verändert. Jetzt musst du den Zählehr verändern.");
		//messages.put(normaliseString("Verändere jetzt den Zähler. Denke daran: Du sollst den Bruch "+startNumerator+"/"+startDenominator+"  oder "+endNumerator+"/"+endDenominator+" erstellen."),"Verändere jetzt den Zählehr. Denke daran: Du sollst den Bruch "+startNumerator+"/"+startDenominator+" oder "+endNumerator+"/"+endDenominator+" erstellen.");
		messages.put(normaliseString("In dieser Aufgabe gibt es zwei Brüche. Du kannst einen weiteren Bruch mithilfe der Symbolleiste für Bilddiagramme (rechts) erstellen."),"In dieser Aufgabe gibt es zwei Brüche. Du kannst einen weiteren Bruch mithilfe der Sümmbohlleiste für Bilddiagramme (rechts) erstellen.");
		messages.put(normaliseString("Sehr gut! Wie erstellst du deinen zweiten Bruch?"),"Sehr gut! Wie erstellst du deinen zweiten Bruch?");
		messages.put(normaliseString("Bitte erstelle noch einen weiteren Bruch."),"Bitte erstelle noch einen weiteren Bruch." );
		//messages.put(normaliseString("Du hast "+startNumerator+"/"+startDenominator+" oder "+endNumerator+"/"+endDenominator+" erstellt. Bitte erstelle "+startNumerator+"/"+startDenominator+" oder "+endNumerator+"/"+endDenominator+".,"Du hast "+startNumerator+"/"+startDenominator+" oder "+endNumerator+"/"+endDenominator+" erstellt. Bitte erstelle "+startNumerator+"/"+startDenominator+" oder "+endNumerator+"/"+endDenominator+".);
		messages.put(normaliseString("In dieser Aufgabe gibt es zwei Brüche. Du kannst einen weiteren Bruch mithilfe der Symbolleiste für Bilddiagramme (rechts) erstellen."),"In dieser Aufgabe gibt es zwei Brüche. Du kannst einen weiteren Bruch mithilfe der Symbolleiste für Bilddiagramme (rechts) erstellen.");
		messages.put(normaliseString("Sehr gut! Wie erstellst du deinen zweiten Bruch?"),"Sehr gut! Wie erstellst du deinen zweiten Bruch?");
		messages.put(normaliseString("Bitte erstelle noch einen weiteren Bruch."),"Bitte erstelle noch einen weiteren Bruch.");
		//messages.put(normaliseString("Du hast "+startNumerator+"/"+startDenominator+" erstellt. Bitte erstelle "+endNumerator+"/"+endDenominator+"."),"Du hast "+startNumerator+"/"+startDenominator+" erstellt. Bitte erstelle "+endNumerator+"/"+endDenominator+".");
		messages.put(normaliseString("In dieser Aufgabe gibt es zwei Brüche. Du kannst einen weiteren Bruch mithilfe der Symbolleiste für Bilddiagramme (rechts) erstellen."),"In dieser Aufgabe gibt es zwei Brüche. Du kannst einen weiteren Bruch mithilfe der Symbolleiste für Bilddiagramme (rechts) erstellen.");
		messages.put(normaliseString("Sehr gut! Wie erstellst du deinen zweiten Bruch?"),"Sehr gut! Wie erstellst du deinen zweiten Bruch?");
		messages.put(normaliseString("Bitte erstelle noch einen weiteren Bruch."),"Bitte erstelle noch einen weiteren Bruch.");
		//messages.put(normaliseString("Du hast "+endNumerator+"/"+endDenominator+" erstellt. Bitte erstelle "+startNumerator+"/"+startDenominator+"."),"Du hast "+endNumerator+"/"+endDenominator+" erstellt. Bitte erstelle "+startNumerator+"/"+startDenominator+".");
		messages.put(normaliseString("Es ist einfacher zwei Brüche zu vergleichen, wenn du für beide dasselbe Bilddiagramm ausgewählt hast."),"Es ist einfacher zwei Brüche zu vergleichen, wenn du für beide dasselbe Bilddiagramm ausgewählt hast.");
		messages.put(normaliseString("Fällt dir eine bessere Möglichkeit ein, die Brüche darzustellen?"),"Fällt dir eine bessere Möglichkeit ein, die Brüche darzustellen?");
		messages.put(normaliseString("Bitte gebrauche für beide Brüche dasselbe Bilddiagramm (benutze z.B. beides Mal ein Rechteck)."),"Bitte gebrauche für beide Brüche dasselbe Bilddiagramm (benutze z.B. beides Mal ein Rechtheck).");
		messages.put(normaliseString("Großartig! Bitte erkläre, warum du ausgerechnet diese Brüche erstellt hast."),"Großartig! Bitte erkläre, warum du ausgerechnet diese Brüche erstellt hast.");
		messages.put(normaliseString("Du könntest die Vergleichsfunktion (am Rand oben) benutzen, um deine Brüche zu vergleichen."),"Du könntest die Vergleichsfunktion (am Rand oben) benutzen, um deine Brüche zu vergleichen.");
		messages.put(normaliseString("Wie kannst du in Fractions Lab prüfen, ob deine Lösung richtig ist?"),"Wie kannst du in  freckt schensläpp prüfen, ob deine Lösung richtig ist?");
		messages.put(normaliseString("Vergleiche die Brüche mithilfe der Vergleichsfunktion (am Rand oben)."),"Vergleiche die Brüche mithilfe der Vergleichsfunktion (am Rand oben).");
		messages.put(normaliseString("Das hast du dir gut erarbeitet! Toll gemacht!"),"Das hast du dir gut erarbeitet! Toll gemacht!");
		messages.put(normaliseString("Bitte erkläre, warum du zustimmst, oder warum nicht."),"Bitte erkläre, warum du zuschtimst, oder warum nicht.");
		messages.put(normaliseString("Ist der Nenner deines Bruches richtig?"),"Ist der Nännähr deines Bruches richtig?");
		messages.put(normaliseString("Du kannst auf den Pfeil neben deinem Bruch klicken, um ihn zu verändern."),"Du kannst auf den Pfeil neben deinem Bruch klicken, um ihn zu verändern.");
		messages.put(normaliseString("Prüfe ob der Nenner deines Bruchs richtig ist."),"Prüfe ob der Nännähr deines Bruchs richtig ist.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Erinnere dich: Der Nenner steht unten im Bruch."),"Erinnere dich: Der Nännähr steht unten im Bruch.");
		messages.put(normaliseString("Prüfe, ob du den Nenner und nicht den Zähler verändert hast."),"Prüfe, ob du den Nännähr und nicht den Zählehr verändert hast.");
		messages.put(normaliseString("Ist das wirklich der Bruch, den du machen wolltest?"),"Ist das wirklich der Bruch, den du machen wolltest?");
		messages.put(normaliseString("Bitte lies die Aufgabe noch einmal gründlich durch."),"Bitte liies die Aufgabe noch einmal gründlich durch.");
		messages.put(normaliseString("Lies die Aufgabe erneut und prüfe deinen Bruch."),"Liies die Aufgabe erneut und prüfe deinen Bruch.");
		messages.put(normaliseString("Sehr gut! Bitte erkläre was \"Zähler\" und \"Nenner\" sind."),"Sehr gut! Bitte erkläre was 'Zählehr' und \"Nännähr\" sind.");
		messages.put(normaliseString("Hast du den Zähler oder den Nenner verändert?"),"Hast du den Zählehr oder den Nännähr verändert?");
		messages.put(normaliseString("Der Nenner ist der untere Teil des Bruchs."),"Der Nännähr ist der untere Teil des Bruchs.");
		messages.put(normaliseString("Du hast den Zähler verändert. Du musst jedoch den Nenner verändern."),"Du hast den Zählehr verändert. Du musst jedoch den Nännähr verändern.");
		messages.put(normaliseString("Sehr gut! Wie wirst du den Zähler verändern?"),"Sehr gut! Wie wirst du den Zählehr verändern?");
		messages.put(normaliseString("Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zähler des Bruchs (das was oben steht) verändern."),"Wenn du neben den oberen Teil des Bruchs klickst, und dann den 'nach oben' Pfeil benutzt, kannst du den Zählehr des Bruchs (das was oben steht) verändern.");
		messages.put(normaliseString("Prüfe, ob du den Nenner und nicht den Zähler verändert hast."),"Prüfe, ob du den Nännähr und nicht den Zählehr verändert hast.");
		//messages.put(normaliseString("Verändere jetzt den Zähler. Denke daran, dass du zwei Brüche erstellen musst, die addiert "+startNumerator+"/"+startDenominator+" ergeben."),"Verändere jetzt den Zählehr. Denke daran, dass du zwei Brüche erstellen musst, die adiihrt "+startNumerator+"/"+startDenominator+" ergeben.");
		messages.put(normaliseString("Sehr gut! Du hast einen Bruch erstellt. Was musst du nun tun, um die Aufgabe fertigzustellen?"),"Sehr gut! Du hast einen Bruch erstellt. Was musst du nun tun, um die Aufgabe fertigzustellen?");
		messages.put(normaliseString("Du musst nun einen zweiten Bruch erstellen, der addiert mit deinem ersten Bruch so viel ergibt, wie der Bruch im Aufgabentext."),"Du musst nun einen zweiten Bruch erstellen, der add i ert mit deinem ersten Bruch so viel ergibt, wie der Bruch im Aufgabentext.");
		messages.put(normaliseString("Überlege dir, wie Brüche addiert werden. Was muss gleich sein, und was wird addiert?"),"Überlege dir, wie Brüche adiihrt werden. Was muss gleich sein, und was wird adiihrt?");
		messages.put(normaliseString("Um zwei Brüche  zu addieren, müssen die Nenner gleich sein. Dann addierst du die Zähler."),"Um zwei Brüche  zu adiihren, müssen die Nännähr gleich sein. Dann  adiihren du die Zählehr.");
		messages.put(normaliseString("Wie kannst du in Fractions Lab prüfen, ob deine Lösung richtig ist?"),"Wie kannst du in  freckt schensläpp prüfen, ob deine Lösung richtig ist?");
		messages.put(normaliseString("Du kannst deine Brüche addieren, indem du die Additionsbox benutzt."),"Du kannst deine Brüche adiihren,, indem du die Additionsbocks benutzt.");
		messages.put(normaliseString("Addiere deine Brüche mithilfe der Additionsbox."),"Addiere deine Brüche mithilfe der Additionsbocks.");
		messages.put(normaliseString("Das hast du dir gut erarbeitet! Toll gemacht!"),"Das hast du dir gut erarbeitet! Toll gemacht!");
		messages.put(normaliseString("Bitte erkläre, wie du die Aufgabe beantwortet hast. Warum hast du diese Brüche erstellt?"),"Bitte erkläre, wie du die Aufgabe beantwortet hast. Warum hast du diese Brüche erstellt?");

		for (int startDenominator=1;startDenominator<21;startDenominator++) {
			messages.put(normaliseString("Sehr gut! Erkläre nun, warum du im Nenner "+startDenominator+"stehen hast."),"Sehr gut! Erkläre nun, warum du im Nännähr "+startDenominator+"stehen hast.");
			messages.put(normaliseString("Du hast den Zähler verändert. Du musst den Nenner auf "+startDenominator+" einstellen."),"Du hast den Zählehr verändert. Du musst den Nännähr auf "+startDenominator+" einstellen.");
			messages.put(normaliseString("Bitte prüfe, ob der Nenner deines Bruches "+startDenominator+" ist und nicht der Zähler deines Bruches.")," Bitte prüfe, ob der Nännähr deines Bruches "+startDenominator+" ist und nicht der Zählehr deines Bruches.");
			messages.put(normaliseString("Bitte prüfe, ob der Nenner (das was unten im Bruch steht) "+startDenominator+" ist."),"Bitte prüfe, ob der Nännähr (das was unten im Bruch steht) "+startDenominator+" ist.");
			messages.put(normaliseString("Sehr gut! Bitte erkläre, warum du den Nenner "+startDenominator+" oder ein Vielfaches von "+startDenominator+" gewählt hast."),"Sehr gut! Bitte erkläre, warum du den Nännähr "+startDenominator+" oder ein Vielfaches von "+startDenominator+" gewählt hast.");
			messages.put(normaliseString("Du hast den Zähler verändert. Du musst den Nenner auf "+startDenominator+" einstellen."),"Du hast den Zählehr verändert. Du musst den Nännähr auf "+startDenominator+"einstellen.");
			messages.put(normaliseString("Prüfe, dass der Nenner deines Bruches  "+startDenominator+" ist, und nicht der Zähler."),"Prüfe, dass der Nännähr deines Bruches  "+startDenominator+" ist, und nicht der Zählehr.");
			messages.put(normaliseString("Prüfe, dass der Nenner  deines Bruches"+startDenominator+" ist."),"Prüfe, dass der Nännähr  deines Bruches"+startDenominator+" ist.");
			messages.put(normaliseString("Sehr gut! Erkläre nun, warum du im Nenner "+startDenominator+" stehen hast."),"Sehr gut! Erkläre nun, warum du im Nännähr "+startDenominator+" stehen hast.");
			messages.put(normaliseString("Sehr gut! Klicke jetzt mit der rechten Maustaste auf den Bruch und kopiere ihn. Klicke danach mit der rechten Maustaste auf den kopierten Bruch und wähle im Menü die Funktion 'Finde einen wertgleichen Bruch', um einen wertgleichen Bruch mit "+startDenominator+" im Nenner zu erstellen."),
					                     "Sehr gut! Klicke jetzt mit der rechten Mausstaste auf den Bruch und kopiere ihn. Klicke danach mit der rechten Mausstaste auf den koopierten Bruch und wähle im Menü 'Finde einen wertgleichen Bruch mit im Nännähr zu erstellen.");
			messages.put(normaliseString("Du hast den Zähler verändert. Du musst den Nenner auf  "+startDenominator+" einstellen."),"Du hast den Zählehr verändert. Du musst den Nännähr auf "+startDenominator+"einstellen.");
			messages.put(normaliseString("Du hast den Zähler verändert. Du musst den Nenner auf "+startDenominator+"einstellen."),"Du hast den Zählehr verändert. Du musst den Nännähr auf "+startDenominator+"einstellen.");
			messages.put(normaliseString("Prüfe, dass der Nenner deines Bruches "+startDenominator+" ist, und nicht der Zähler."),"Prüfe, dass der Nännähr deines Bruches "+startDenominator+" ist, und nicht der Zählehr.");
			messages.put(normaliseString("Bitte prüfe, ob der Nenner und nicht der Zähler deines Bruches " +startDenominator+ "ist."),"Bitte prüfe, ob der Nännähr und nicht der Zählehr deines Bruches " +startDenominator+ "ist.");
			messages.put(normaliseString("Bitte prüfe, ob der Nenner (das was unten im Bruch steht)" +startDenominator+ "ist."),"Bitte prüfe, ob der Nännähr (das was unten im Bruch steht)" +startDenominator+ "ist.");

		}
		for (int startDenominator=1;startDenominator<21;startDenominator++) {
			for (int endDenominator=1;endDenominator<21;endDenominator++) {
				messages.put(normaliseString("Prüfe, dass der Nenner deines Bruches "+startDenominator+" oder "+endDenominator+" ist, und nicht der Zähler."),"Prüfe, dass der Nännähr deines Bruches "+startDenominator+" oder "+endDenominator+" ist,");
				messages.put(normaliseString("Bitte prüfe, ob der Nenner (das was unten im Bruch steht) "+startDenominator+" oder "+endDenominator+" ist."),"Bitte prüfe, ob der Nännähr (das was unten im Bruch steht) "+startDenominator+" oder "+endDenominator+" ist.");
				messages.put(normaliseString("Du hast den Zähler verändert. Du musst den Nenner in "+startDenominator+" oder "+endDenominator+" ändern."),"Du hast den Zählehr verändert. Du musst den Nännähr in "+startDenominator+" oder "+endDenominator+" ändern.");

			}
		}

	}
	
	public Map<String, String> getMessages() {
		return messages;
	}

	public void setMessages(HashMap<String, String> messages) {
		this.messages = messages;
	}
	
	
	/**
     * Takes a string and returns the same string where fractions in digits are replaced as fractions in texts
     *
     *	For example input:"please make 1/2" retrieves output "please make one half". 
     *
     * @param the string to convert
     * @return string
     */
	public String replaceFractions(String message) {
		  int length = message.length();
		  boolean inFraction = false;
		  for (int i = 0; i < length; i++) {
			char c = message.charAt(i);
			//if ()
		  }
		return "";
	}
	
	/**
     * Takes a string and returns the same string without whitespace
     * on the borders and with all whitespace normalised to length 1.
     *
     * For example " A    long space" becomes "A long space". 
     *
     * @param the string to normalise
     * @return the same string with normalised whitespaces
     */
    public static String normaliseString(String string) {
	  String str = string.trim();
	  int length = str.length();
	  char[] charArray = new char[length];
	  boolean inWhitespace = false;
	  int j = 0;
	  for (int i = 0; i < length; i++) {
		char c = str.charAt(i);
		if (c == ' ') {
			if (inWhitespace) {
				continue;
			} else {
				inWhitespace = true;
			}
		} else {
			inWhitespace = false;			
		}
		charArray[j] = c;	
		j++;
	  }
	  return new String(charArray).trim();
    }	

	
}
