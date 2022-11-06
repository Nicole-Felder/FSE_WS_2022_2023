import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.List;

public class JSONExporter implements IExportable{
    @Override
    public void export(List<Article> articleList) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("export.json"));
            String exportString = "[\n";
            for(int i = 0;i<articleList.size();i++)
            {
                Article article = articleList.get(i);
                exportString += "{\"Number\":" + "\""+article.getNumber()+"\"" + ", " +"\"Name\":"+ "\""+article.getName()+"\""+ "," + "\"Manufacturer\":"+"\""+article.getManufacturer() +"\""+"}";

                if(i<articleList.size()-1)
                {
                    exportString += ",\n";
                }
            }
            exportString += "]";
            writer.write(exportString);
            writer.close();
        } catch(IOException ioException)
        {
            System.out.println(ioException.getMessage());
        }
    }
}



