import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String mediumData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortData = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));


        System.out.println("Formato originale " + data);
        System.out.println("Data in formato FULL: " + dataFull);
        System.out.println("Data in formato MEDIUM" + mediumData);
        System.out.println("Data in formato SHORT: " + shortData);

    }
}