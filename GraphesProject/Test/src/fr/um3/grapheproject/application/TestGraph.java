package fr.um3.grapheproject.application;

import java.util.ArrayList;

import org.jgrapht.*;
import org.jgrapht.graph.*;

import fr.um3.grapheproject.utilitygraphe.Algorithms;
import fr.um3.grapheproject.utilitygraphe.Node;
import fr.um3.grapheproject.utilitygraphe.*;
import prog.algo.scraper.Scraper;


public class TestGraph {
	public static void main(String args[]) {
		Graph<Node,DefaultWeightedEdge> graphe = OutilsGraphe.getDirectedData();
		System.out.println("----------------------- GetPotentiel -----------------------");
		Algorithms.ShortestPaths(OutilsGraphe.getSimpleDirectedWeightedGraphData1(), 45, 24);		
	}
}

