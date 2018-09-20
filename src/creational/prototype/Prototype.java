package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype {

  public static void main(String[] args) {
    List<String> pages = new ArrayList<>();
//    Create pages
    for (int i = 0; i < 5; i++) {
      pages.add("Page #" + i);
    }

//    SearchResult searchResult = new FederatedSearchResult(pages); // TODO: 20/09/18 Usar la interfaz o la clase?
    FederatedSearchResult searchResult = new FederatedSearchResult(pages);

//    Clone search Result
    SearchResult otherResult = searchResult.clone();
    otherResult.addPage("Page #5");
    otherResult.addPage("Page #6");

    System.out.println("First Search\t" + searchResult.getPages());
    System.out.println("Second Search\t: " + otherResult.getPages());
    
  }
}

interface SearchResult {

  SearchResult clone();

  int totalEntries();

  String getPage(int page);

  void addPage(String page);

  List<String> getPages();
}

class FederatedSearchResult implements SearchResult {

  private List<String> pages;

  public FederatedSearchResult(List<String> pages) {
    this.pages = pages;
  }

  @Override
  public SearchResult clone() {
    final List<String> resultCopies = new ArrayList<>();
    pages.forEach(p -> resultCopies.add(p));
    FederatedSearchResult federatedSearchResult = new FederatedSearchResult(resultCopies);
    return federatedSearchResult;
  }

  @Override
  public int totalEntries() {
    return pages.size();
  }

  @Override
  public String getPage(int page) {
    return pages.get(page);
  }

  @Override
  public void addPage(String page) {
    pages.add(page);
  }

  public List<String> getPages() { // TODO: 20/09/18 Se necesita poner getters and setters en la intefaz? 
    return pages;
  }
}