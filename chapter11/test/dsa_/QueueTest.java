package dsa_;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue myQueue;

    @BeforeEach
    void setUp(){
        myQueue = new HashQueue();
    }

    @Test
    void testQueueIsEmpty() {
        assertTrue(myQueue.isEmpty());
    }

    @Test
    void testThatWhenItemIsPushedQueueNotEmpty() {
        myQueue.push("Sneakers");
        assertFalse(myQueue.isEmpty());
    }

    @Test
    void testThatWhenItemIsPushedQueueSizeExpands() {
        myQueue.push("Sneakers");
        myQueue.push("Chains");
        assertEquals(2, myQueue.size());
    }

    @Test
    void testThatQueueCanPopItem(){
        myQueue.push("Sneakers");
        myQueue.push("Chains");
        myQueue.pop();
        assertEquals(1, myQueue.size());
    }

    @Test
    void testThatQueueCanPeekItem(){
        myQueue.push("Sneakers");
        myQueue.push("Chains");
        assertEquals("Sneakers", myQueue.peek());
    }
}
