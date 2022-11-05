import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVExporter implements IExportable{

    @Override
    public void export(List<Article> articleList) {
        try {
            FileWriter fileWriter = new FileWriter("export.csv");
            fileWriter.write("Number;Name;Manufacturer\n");
            for(Article article : articleList)
            {
                String line = article.getNumber() + ";" + article.getName() + ";" + article.getManufacturer()+"\n";
                fileWriter.write(line);
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
