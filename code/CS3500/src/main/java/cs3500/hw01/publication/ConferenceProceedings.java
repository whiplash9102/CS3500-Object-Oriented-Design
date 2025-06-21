package cs3500.hw01.publication;

public class ConferenceProceedings implements Publication{
    /*
     * Represent the details information about the conference of authors 
     */

    private final String editorLastName; 
    private final String editorFirstName;
    private final String title;
    private final String location;
    private final int year;
    private String publisher;

    /**
     * Construct a conference information
     * 
     * @param editorLastName the last name of the editor
     * @param editorFirstName the first name of the editor
     * @param title the title of the editor
     * @param location the location where the conference information appears
     * @param year the year where the conference be hold
     * @param the publisher of conference
     */

    public ConferenceProceedings(String editorLastName, String editorFirstName, String title, String location, int year, String publisher) { 
        this.editorFirstName = editorFirstName;
        this.editorLastName = editorLastName;
        this.title = title;
        this.location = location;
        this.year = year;
        this.publisher = publisher;
    }
    @Override
    public String citeApa() {
        // Add dot to initial and space after comma
        String editorInitial = editorFirstName.isEmpty() ? "" : editorFirstName.charAt(0) + ".";
        return String.format("%s, %s (Ed.). (%d). %s (%s). %s.",
                editorLastName, editorInitial, year, title, location, publisher);
    }



    @Override
    public String citeMla(){
        return "";
    }
}
