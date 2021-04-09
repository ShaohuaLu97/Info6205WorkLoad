/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.info6205.randomwalk;

import java.util.Random;

public class RandomWalk {

    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    /**
     * Private method to move the current position, that's to say the drunkard moves
     *
     * @param dx the distance he moves in the x direction
     * @param dy the distance he moves in the y direction
     */
    private void move(int dx, int dy) {
        // TO BE IMPLEMENTED
    	x += dx;
    	y += dy;
    }

    /**
     * Perform a random walk of m steps
     *
     * @param m the number of steps the drunkard takes
     */
    private void randomWalk(int m) {
        // TO BE IMPLEMENTED
    	for (int i = 0; i < m; i++) {
    		randomMove();
    	}
    }

    /**
     * Private method to generate a random move according to the rules of the situation.
     * That's to say, moves can be (+-1, 0) or (0, +-1).
     */
    private void randomMove() {
        boolean ns = random.nextBoolean();
        int step = random.nextBoolean() ? 1 : -1;
        move(ns ? step : 0, ns ? 0 : step);
    }

    /**
     * Method to compute the distance from the origin (the lamp-post where the drunkard starts) to his current position.
     *
     * @return the (Euclidean) distance from the origin to the current position.
     */
    public double distance() {
        // TO BE IMPLEMENTED
    	return Math.sqrt(x*x + y*y);
    }

    /**
     * Perform multiple random walk experiments, returning the mean distance.
     *
     * @param m the number of steps for each experiment
     * @param n the number of experiments to run
     * @return the mean distance
     */
    public static double randomWalkMulti(int m, int n) {
        double totalDistance = 0;
        for (int i = 0; i < n; i++) {
            RandomWalk walk = new RandomWalk();
            walk.randomWalk(m);
            totalDistance = totalDistance + walk.distance();
        }
        return totalDistance / n;
    }

    public static void main(String[] args) {
//        if (args.length == 0)
//            throw new RuntimeException("Syntax: RandomWalk steps [experiments]");
//        int m = Integer.parseInt(args[0]);
//        int n = 30;
//        if (args.length > 1) n = Integer.parseInt(args[1]);
    	int m = 100;
    	int n = 30;
        double meanDistance = randomWalkMulti(m, n);
        System.out.println(m + " steps: " + meanDistance + " over " + n + " experiments");

    	int m1 = 200;
    	int n1 = 30;
        double meanDistance1 = randomWalkMulti(m1, n1);
        System.out.println(m1 + " steps: " + meanDistance1 + " over " + n1 + " experiments");

    	int m2 = 300;
    	int n2 = 30;
        double meanDistance2 = randomWalkMulti(m2, n2);
        System.out.println(m2 + " steps: " + meanDistance2 + " over " + n2 + " experiments");

    	int m3 = 400;
    	int n3 = 30;
        double meanDistance3 = randomWalkMulti(m3, n3);
        System.out.println(m3 + " steps: " + meanDistance3 + " over " + n3 + " experiments");

    	int m4 = 500;
    	int n4 = 30;
        double meanDistance4 = randomWalkMulti(m4, n4);
        System.out.println(m4 + " steps: " + meanDistance4 + " over " + n4 + " experiments");

    	int m5 = 600;
    	int n5 = 30;
        double meanDistance5 = randomWalkMulti(m5, n5);
        System.out.println(m5 + " steps: " + meanDistance5 + " over " + n5 + " experiments");

    }

}
