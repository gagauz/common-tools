package com.gagauz.common.tools;

import java.util.*;

public class C {
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<K, V> source) {
        return new HashMap<K, V>(source);
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<E>();
    }

    public static <E> HashSet<E> newHashSet(Collection<E> source) {
        return new HashSet<E>(source);
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<E>();
    }

    public static <E> ArrayList<E> newArrayList(int capacity) {
        return new ArrayList<E>(capacity);
    }

    public static <E> ArrayList<E> newArrayList(Collection<E> source) {
        return new ArrayList<E>(source);
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<E>();
    }

    public static <E> LinkedList<E> newLinkedList(Collection<E> source) {
        return new LinkedList<E>(source);
    }

}
