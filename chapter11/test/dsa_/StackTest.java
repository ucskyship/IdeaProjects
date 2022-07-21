package dsa_;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
   HashStack myStack;
    @BeforeEach
    void setUp() {

        myStack = new HashStack();
    }

    @Test
    @DisplayName("To test that stack is empty")
    void testEmptyStack() {
        assertTrue(myStack.empty());
    }

    @Test
    @DisplayName("To test that stack is not empty when an item is added")
    void testThatStackCanPushItems() {
        myStack.push("BlackBottle");
        assertFalse(myStack.empty());
    }

    @Test
    @DisplayName("To test that empty stack throws underflow exception when popped")
    void testThatStackIsEmptyWhenPushedToZero() {
        myStack.push("BlackBottle");
        myStack.pop();
        assertTrue(myStack.empty());
    }

    @Test
    @DisplayName("To test that when push item to stack size increment")
    void testThatSizeIncrementsWhenPushed(){
        myStack.push("BlackBottle");
        myStack.push("GreenBottle");
        assertEquals(2, myStack.size());
    }

    @Test
    @DisplayName("To test that stack can push x and be pop y")
    void testThatStackCanPopItem() {
        myStack.push("drugs");
        myStack.push("BlackBottle");
        myStack.push("Water");
        myStack.pop();
        assertNotNull(myStack.getItem(0));
        assertEquals(2, myStack.size());
        assertNull(myStack.getItem(2));
    }

    @Test
    @DisplayName("To test that stack can peek item correctly")
    void tesThatStackCanPeekItem() {
        myStack.push("Bottle");
        myStack.push("BlackRemote");
        assertEquals("BlackRemote",  myStack.peek());
        assertEquals(2, myStack.size());
    }

    @Test
    @DisplayName("To test that we can search item pushed to stack")
    void testThatWeCanSearchItem() {
        myStack.push("BlackBottle");
        myStack.push("BlackRemote");
        myStack.push("Bag");
        assertEquals(2, myStack.search("Bag"));
    }
}