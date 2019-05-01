package fr.um3.grapheproject.mjgrapht;

import prog.algo.scraper.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.alg.cycle.HawickJamesSimpleCycles;
import org.jgrapht.alg.tour.TwoApproxMetricTSP;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import fr.um3.grapheproject.utilitygraphe.Node;
import fr.um3.grapheproject.utilitygraphe.OutilsGraphe;

public class TestMethods {

	static Graph<Node,DefaultWeightedEdge> graphe = OutilsGraphe.getDirectedData();
	static DefaultUndirectedWeightedGraph<Node, DefaultWeightedEdge> grapheNonOriente = OutilsGraphe.createUndirectedGraph(graphe);

	public static void main(String[] args) {

		TwoApproxMetricTSP<Node,DefaultWeightedEdge>grapheSMA = new TwoApproxMetricTSP<Node,DefaultWeightedEdge>();
		GraphPath<Node, DefaultWeightedEdge>test = grapheSMA.getTour(grapheNonOriente);
		
		
	}

}
