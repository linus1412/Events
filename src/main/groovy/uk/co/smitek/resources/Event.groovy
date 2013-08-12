package uk.co.smitek.resources

/**
 * Created with IntelliJ IDEA.
 * User: martins
 * Date: 10/07/2013
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
class Event {

    private String baseUrl

    String id
    Date date
    String description
    String link

    void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl
    }

}
