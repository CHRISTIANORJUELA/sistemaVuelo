package models;

public class DesignAirplaneCabin {
    private Long id;
    private String urlDesign;
    private int columns;
    private int rows;

    public DesignAirplaneCabin(Long id, String urlDesign, int columns, int rows) {
        this.id = id;
        this.urlDesign = urlDesign;
        this.columns = columns;
        this.rows = rows;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlDesign() {
        return urlDesign;
    }

    public void setUrlDesign(String urlDesign) {
        this.urlDesign = urlDesign;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
