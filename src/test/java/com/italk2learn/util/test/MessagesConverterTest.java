package com.italk2learn.util.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;

import static org.junit.Assert.*;

import com.italk2learn.util.MessagesConverter;

public class MessagesConverterTest {

    private static Map<String,String> sentenceMap = null;

    @BeforeClass
    public static void initSentenceMap() {
	  sentenceMap = new HashMap<String,String>();
	  sentenceMap.put("NoSpacesHere", "NoSpacesHere");
	  sentenceMap.put(" just trim ", "just trim");
	  sentenceMap.put("only trim at the end ", "only trim at the end");
	  sentenceMap.put("a   B", "a B");
	  sentenceMap.put(" a   c", "a c");
	  sentenceMap.put("a   d ", "a d");
	  sentenceMap.put(" a   e ", "a e");
	  sentenceMap.put(" a f ", "a f");
	  sentenceMap.put(" a  g ", "a g");
	  sentenceMap.put("    ", "");
	  sentenceMap.put("", "");
	  sentenceMap.put("A long   space", "A long space");
	  sentenceMap.put("  Another long   space", "Another long space");
    }

    @Test
    public void testStringNormalisation() {
	  for (String str : sentenceMap.keySet()) {
		assertEquals(sentenceMap.get(str), MessagesConverter.normaliseString(str));
	  }
    }
}
