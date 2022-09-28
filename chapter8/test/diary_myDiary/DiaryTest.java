package diary_myDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    Entry entry;
    Entry entry1;
    Entry entry2;

    @BeforeEach
    void setUp() {
        diary = new Diary();
        entry = new Entry("first entry test", "I love you all");
        entry1 = new Entry("second entry obj", "I miss you all");
        entry2 = new Entry("third entry obj", "I love Ucious");
    }

    @Test
    @DisplayName("To test that we have a diary and entries are empty")
    void testThatDiaryISEmpty() {
        assertTrue(diary.isEmpty());
    }

    @Test
    @DisplayName("To test that we can add an entry")
    void testThaWeCanAddAnEntry() {
        diary.add(entry);
        assertEquals(1, diary.size());
    }

    @Test
    @DisplayName("To test that an entry has valid id")
    void testThatAnEntryHasAnId() {
        diary.add(entry);
        diary.add(entry1);
        assertEquals(1, entry.getId());
        assertEquals(2, entry1.getId());
    }

    @Test
    @DisplayName("To test that an entry has valid id")
    void testThatAnEntryHasBody() {
        diary.add(entry);
        diary.add(entry1);
        diary.add(entry2);
        assertEquals(1, entry.getId());
        assertEquals(2, entry1.getId());
        assertEquals(3, entry2.getId());
    }

    @Test
    @DisplayName("To test that we can set tittle to entry")
    void testThatWeCanSetTitleToEntry() {
        entry.setTitle("New tittle");
        assertEquals("New tittle", entry.getTitle());
    }

    @Test
    @DisplayName("To test that we can set body to entry")
    void testThatWeCanSetBodyToEntry() {
        entry.setBody("new body says how are you doing");
        assertEquals("new body says how are you doing", entry.getBody());
    }

    @Test
    @DisplayName("Test to search for entry by id")
    void testThatWeCanSearchForEntryById() {
        diary.add(entry);
        diary.add(entry1);
        diary.add(entry2);

        var searched = diary.searchById(3);
        assertEquals("third entry obj", searched.getTitle());

        Entry searched2 = diary.searchById(1);
        assertEquals("first entry test", searched2.getTitle());
    }

    @Test
    @DisplayName("Test to search for entry by tittle")
    void testThatWeCanSearchForEntryByTittle() {
        diary.add(entry);
        diary.add(entry1);
        diary.add(entry2);

        var searched = diary.searchByTittle("third entry obj");
        assertEquals(3, searched.getId());

        var search = diary.searchByTittle("first entry test");
        assertEquals("I love you all", search.getBody());
    }

    @Test
    @DisplayName("Test that we can delete an entry from diary")
    void testThatEntryCanBeDeleted() {
        diary.add(entry);
        diary.add(entry1);
        diary.add(entry2);
        assertEquals(3, diary.size());

        diary.delete(entry1);
        //check that entry is now 2 after deleting 1 out of the 3
        assertEquals(2, diary.size());
    }

    @Test
    @DisplayName("Test that we can delete an entry from diary by id")
    void testThatEntryCanBeDeletedById() {
        diary.add(entry);
        diary.add(entry1);
        diary.add(entry2);
        assertEquals(3, diary.size());

        diary.deleteById(1);
        //check that entry is now 2 after deleting 1 out of the 3
        assertEquals(2, diary.size());
    }

    @Test
    @DisplayName("Test that we can edit already existing entry")
    void testThatEntryCanBeEdited() {
        diary.add(entry);
        diary.add(entry1);
        diary.add(entry2);
        assertEquals("I miss you all", entry1.getBody());
        assertEquals("I love Ucious", entry2.getBody());

        entry1.setBody("this is my new body");
        assertEquals("this is my new body", entry1.getBody());
        assertEquals(3, diary.size());

        entry2.setBody("this is for Ucious");
        assertEquals("this is for Ucious", entry2.getBody());
        assertEquals(3, diary.size());
    }
}