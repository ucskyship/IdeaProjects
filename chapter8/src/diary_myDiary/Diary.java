package diary_myDiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private int counter;
    private final List<Entry> entries = new ArrayList<>();

    public boolean isEmpty() {
        return true;
    }

    public void add(Entry entry) {
        counter++;
        entry.setId(counter);
        entries.add(entry);
    }

    public int size() {
        return entries.size();
    }

    public void delete(Entry entry) {
        entries.remove(entry);
    }

    public Entry searchById(int id) {
        for (Entry checkAsEntryObj : entries){
            if(checkAsEntryObj.getId() == id){
                return checkAsEntryObj;
            }
        }
        return null;
    }

    public void deleteById(int id) {
        Entry foundEntry = searchById(id);
        entries.remove(foundEntry);
    }

    public Entry searchByTittle(String tittle) {
        for (Entry checkAsEntryObj : entries){
            if(checkAsEntryObj.getTitle().equalsIgnoreCase(tittle)){
                return checkAsEntryObj;
            }
        }
        return null;
    }
}
