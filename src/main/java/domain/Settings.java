package domain;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlType
@XmlRootElement
public class Settings {
    @XmlElement
    public Page page;
    @XmlElementWrapper(name = "columns")
    @XmlElements({@XmlElement(name = "column", type = Settings.Column.class)})
    public List<Column> columns;

    @Override
    public String toString() {
        return "Settings{" +
                "page=" + page +
                ", columns=" + columns +
                '}';
    }

    @XmlRootElement
    public static class Page {
        public int width;
        public int height;

        @Override
        public String toString() {
            return "Page{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }

    @XmlRootElement
    public static class Column {
        public String title;
        public int width;

        @Override
        public String toString() {
            return "Column{" +
                    "title='" + title + '\'' +
                    ", width=" + width +
                    '}';
        }

    }
}

