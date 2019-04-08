package com.kodilla.testing.forum.statistics;


import org.junit.*;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    public ForumStatisticsTestSuite() {
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        ++testCounter;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
        System.out.println("-------------------------------------");
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoPosts() {
        Statistics statisticsMock = (Statistics)Mockito.mock(Statistics.class);
        List<String> testUsers = new List<String>() {
            @Override
            public int size() {
                return 1;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains( Object o ) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray( T[] a ) {
                return null;
            }

            @Override
            public boolean add( String s ) {
                return false;
            }

            @Override
            public boolean remove( Object o ) {
                return false;
            }

            @Override
            public boolean containsAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean addAll( Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean addAll( int index, Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean removeAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean retainAll( Collection<?> c ) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get( int index ) {
                return null;
            }

            @Override
            public String set( int index, String element ) {
                return null;
            }

            @Override
            public void add( int index, String element ) {

            }

            @Override
            public String remove( int index ) {
                return null;
            }

            @Override
            public int indexOf( Object o ) {
                return 0;
            }

            @Override
            public int lastIndexOf( Object o ) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator( int index ) {
                return null;
            }

            @Override
            public List<String> subList( int fromIndex, int toIndex ) {
                return null;
            }
        };
        Mockito.when(statisticsMock.usersNames()).thenReturn(testUsers);
        Mockito.when(statisticsMock.postsCount()).thenReturn(0);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(120);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0L, (long)forumStatistics.averagePostsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhen1000Posts() {
        Statistics statisticsMock = (Statistics)Mockito.mock(Statistics.class);
        List<String> testUsers = new List<String>() {
            @Override
            public int size() {
                return 1;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains( Object o ) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray( T[] a ) {
                return null;
            }

            @Override
            public boolean add( String s ) {
                return false;
            }

            @Override
            public boolean remove( Object o ) {
                return false;
            }

            @Override
            public boolean containsAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean addAll( Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean addAll( int index, Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean removeAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean retainAll( Collection<?> c ) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get( int index ) {
                return null;
            }

            @Override
            public String set( int index, String element ) {
                return null;
            }

            @Override
            public void add( int index, String element ) {

            }

            @Override
            public String remove( int index ) {
                return null;
            }

            @Override
            public int indexOf( Object o ) {
                return 0;
            }

            @Override
            public int lastIndexOf( Object o ) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator( int index ) {
                return null;
            }

            @Override
            public List<String> subList( int fromIndex, int toIndex ) {
                return null;
            }
        };
        Mockito.when(statisticsMock.usersNames()).thenReturn(testUsers);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(1000L, (long)forumStatistics.averagePostsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoComments() {
        Statistics statisticsMock = (Statistics)Mockito.mock(Statistics.class);
        List<String> testUsers = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains( Object o ) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray( T[] a ) {
                return null;
            }

            @Override
            public boolean add( String s ) {
                return false;
            }

            @Override
            public boolean remove( Object o ) {
                return false;
            }

            @Override
            public boolean containsAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean addAll( Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean addAll( int index, Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean removeAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean retainAll( Collection<?> c ) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get( int index ) {
                return null;
            }

            @Override
            public String set( int index, String element ) {
                return null;
            }

            @Override
            public void add( int index, String element ) {

            }

            @Override
            public String remove( int index ) {
                return null;
            }

            @Override
            public int indexOf( Object o ) {
                return 0;
            }

            @Override
            public int lastIndexOf( Object o ) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator( int index ) {
                return null;
            }

            @Override
            public List<String> subList( int fromIndex, int toIndex ) {
                return null;
            }
        };
        Mockito.when(statisticsMock.usersNames()).thenReturn(testUsers);
        Mockito.when(statisticsMock.postsCount()).thenReturn(123);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0L, (long)forumStatistics.averageCommentsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhenMorePostsThanComments() {
        Statistics statisticsMock = (Statistics)Mockito.mock(Statistics.class);
        List<String> testUsers = new List<String>() {
            @Override
            public int size() {
                return 1;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains( Object o ) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray( T[] a ) {
                return null;
            }

            @Override
            public boolean add( String s ) {
                return false;
            }

            @Override
            public boolean remove( Object o ) {
                return false;
            }

            @Override
            public boolean containsAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean addAll( Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean addAll( int index, Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean removeAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean retainAll( Collection<?> c ) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get( int index ) {
                return null;
            }

            @Override
            public String set( int index, String element ) {
                return null;
            }

            @Override
            public void add( int index, String element ) {

            }

            @Override
            public String remove( int index ) {
                return null;
            }

            @Override
            public int indexOf( Object o ) {
                return 0;
            }

            @Override
            public int lastIndexOf( Object o ) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator( int index ) {
                return null;
            }

            @Override
            public List<String> subList( int fromIndex, int toIndex ) {
                return null;
            }
        };
        Mockito.when(statisticsMock.usersNames()).thenReturn(testUsers);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(10);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0.01D, (double)forumStatistics.averageCommentsPerPost, 0.1D);
    }

    @Test
    public void testCalculateAdvStatisticsWhenMoreCommentsThanPosts() {
        Statistics statisticsMock = (Statistics)Mockito.mock(Statistics.class);
        List<String> testUsers = new List<String>() {
            @Override
            public int size() {
                return 1;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains( Object o ) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray( T[] a ) {
                return null;
            }

            @Override
            public boolean add( String s ) {
                return false;
            }

            @Override
            public boolean remove( Object o ) {
                return false;
            }

            @Override
            public boolean containsAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean addAll( Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean addAll( int index, Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean removeAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean retainAll( Collection<?> c ) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get( int index ) {
                return null;
            }

            @Override
            public String set( int index, String element ) {
                return null;
            }

            @Override
            public void add( int index, String element ) {

            }

            @Override
            public String remove( int index ) {
                return null;
            }

            @Override
            public int indexOf( Object o ) {
                return 0;
            }

            @Override
            public int lastIndexOf( Object o ) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator( int index ) {
                return null;
            }

            @Override
            public List<String> subList( int fromIndex, int toIndex ) {
                return null;
            }
        };
        Mockito.when(statisticsMock.usersNames()).thenReturn(testUsers);
        Mockito.when(statisticsMock.postsCount()).thenReturn(10);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(100L, (long)forumStatistics.averageCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoUsers() {
        Statistics statisticsMock = (Statistics)Mockito.mock(Statistics.class);
        List<String> testUsers = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains( Object o ) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray( T[] a ) {
                return null;
            }

            @Override
            public boolean add( String s ) {
                return false;
            }

            @Override
            public boolean remove( Object o ) {
                return false;
            }

            @Override
            public boolean containsAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean addAll( Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean addAll( int index, Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean removeAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean retainAll( Collection<?> c ) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get( int index ) {
                return null;
            }

            @Override
            public String set( int index, String element ) {
                return null;
            }

            @Override
            public void add( int index, String element ) {

            }

            @Override
            public String remove( int index ) {
                return null;
            }

            @Override
            public int indexOf( Object o ) {
                return 0;
            }

            @Override
            public int lastIndexOf( Object o ) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator( int index ) {
                return null;
            }

            @Override
            public List<String> subList( int fromIndex, int toIndex ) {
                return null;
            }
        };
        Mockito.when(statisticsMock.usersNames()).thenReturn(testUsers);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(0L, (long)forumStatistics.averageCommentsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhen100Users() {
        Statistics statisticsMock = (Statistics)Mockito.mock(Statistics.class);
        List<String> testUsers = new List<String>() {
            @Override
            public int size() {
                return 1;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains( Object o ) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray( T[] a ) {
                return null;
            }

            @Override
            public boolean add( String s ) {
                return false;
            }

            @Override
            public boolean remove( Object o ) {
                return false;
            }

            @Override
            public boolean containsAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean addAll( Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean addAll( int index, Collection<? extends String> c ) {
                return false;
            }

            @Override
            public boolean removeAll( Collection<?> c ) {
                return false;
            }

            @Override
            public boolean retainAll( Collection<?> c ) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get( int index ) {
                return null;
            }

            @Override
            public String set( int index, String element ) {
                return null;
            }

            @Override
            public void add( int index, String element ) {

            }

            @Override
            public String remove( int index ) {
                return null;
            }

            @Override
            public int indexOf( Object o ) {
                return 0;
            }

            @Override
            public int lastIndexOf( Object o ) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator( int index ) {
                return null;
            }

            @Override
            public List<String> subList( int fromIndex, int toIndex ) {
                return null;
            }
        };
        Mockito.when(statisticsMock.usersNames()).thenReturn(testUsers);
        Mockito.when(statisticsMock.postsCount()).thenReturn(100);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        Assert.assertEquals(100L, (long)forumStatistics.averageCommentsPerUser);
    }
}


