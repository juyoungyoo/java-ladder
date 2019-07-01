package com.ladder.model;

import java.util.Objects;

public class Point {

    static final Point POINT_LEFT = Point.of(true, false);
    static final Point POINT_RIGHT = Point.of(false, true);
    static final Point POINT_DOWN = Point.of(false, false);
    static final boolean NO_MOVABLE = false;

    private final boolean left;
    private final boolean right;

    private Point(boolean left, boolean right) {
        this.left = left;
        this.right = right;
    }

    static Point of(boolean left, boolean right) {
        return new Point(left, right);
    }

    static Point of(String left, String right) {
        return new Point(Boolean.valueOf(left), Boolean.valueOf(right));
    }

    static Point ofFirst(boolean current) {
        return new Point(NO_MOVABLE, current);
    }

    static Point ofLast(boolean current) {
        return new Point(current, NO_MOVABLE);
    }

    boolean isRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return left == point.left &&
                right == point.right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return "Point{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
