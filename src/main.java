import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article("Win20", "1", "Microsoft"));
        articles.add(new Article("MaxOsx", "2", "Apple"));
        articles.add(new Article("Linux1", "3", "Suse"));
        articles.add(new Article("Android", "4", "Google"));

       ExporterContext exporterContext = new ExporterContext(new CSVExporter());
       exporterContext.doExport(articles);
       // exporterContext.setExporter(new JSONExporter());
       // exporterContext.doExport(articles);

    }
}
