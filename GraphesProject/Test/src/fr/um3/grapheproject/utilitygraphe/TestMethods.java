package fr.um3.grapheproject.utilitygraphe;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.*;
import org.jgrapht.graph.SimpleWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import fr.um3.grapheproject.*;
import prog.algo.scraper.Scraper;
import org.jgrapht.alg.*;


public class TestMethods {
	
	// Classe d'application des algorithmes codés par le groupe
		
	public static void main(String[] args) {
		
		int i = 22;
		int ida = 11;
		
		
		//System.out.println("------ Potentiels pour un sommet i depuis les autres sommets ------");

		//Algorithms.ShortestPaths(OutilsGraphe.getSimpleDirectedWeightedGraphData(), i, ida);
		
		//System.out.println("------ Plus court chemin entre deux sommets ------");
		//GraphPath<Node, DefaultWeightedEdge> ShortestPath = DijkstraShortestPath.findPathBetween(OutilsGraphe.UndirectedGraph, OutilsGraphe.getBigSommetVilles().get(45), OutilsGraphe.getBigSommetVilles().get(23));
		//System.out.println("testxxx");

		
		//Algorithms.getPath(V source, V sink)
		//System.out.println("------ Arbre de poids minimum ------");
		//Algorithms.KruskalAlgo(OutilsGraphe.UndirectedGraph);
	}
/*
	private static SimpleDirectedWeightedGraphData<Node, DefaultWeightedEdge> getSimpleDirectedWeightedGraphData() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
