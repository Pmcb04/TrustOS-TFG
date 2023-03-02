import React, { useRef, useEffect } from 'react';
import * as d3 from 'd3';
import { getImage } from '../../shared/util/asset-image-name';

const Graph = (props) => {

  let nodesList = JSON.parse(JSON.stringify(props.nodes));
  let linksList =  JSON.parse(JSON.stringify(props.links));
  const svgRef = useRef();

  const distanceLinks = 250
  const gravity = -50

  const arrowLinkSize = 10
  const linkColor = "#999"
  const linkStrokeWidth = "2px"

  const radiusNode = 20

  const fontFamilyNodeLabel = "Arial"
  const fontSizeNodeLabel = "20px"
  const fontWidthNodeLabel = "bold"
  const fontColorNodeLabel = "black"

  useEffect(() => {
    const svg = d3.select(svgRef.current);
    
    let simulation = d3.forceSimulation(nodesList)
        .force('link', d3.forceLink(linksList).id(d => d.id).distance(distanceLinks))
        .force('center', d3.forceCenter(props.width / 2, props.height / 2))
        .force('charge', d3.forceManyBody().strength(gravity));
    
    
    // Define la flecha
    svg.append("svg:defs").append("svg:marker")
        .attr("id", "arrow")
        .attr("viewBox", "0 -5 10 10")
        .attr("refX", 15)
        .attr("markerWidth", arrowLinkSize)
        .attr("markerHeight", arrowLinkSize)
        .attr("orient", "auto")
        .append("svg:path")
        .attr("d", "M0,-5L10,0L0,5");

    const link = svg.append('g')
        .selectAll('line')
        .data(linksList)
        .enter()
        .append('line')
        .attr('stroke', 'black')
        .attr('stroke-width', 2)
        .style("stroke", linkColor) // darle estilo al enlace
        .style("stroke-width", linkStrokeWidth) // darle estilo al enlace
        .attr("marker-end", "url(#arrow)");


    var node = svg.append('g')
        .selectAll('circle')
        .data(nodesList)
        .enter()
        .append('circle')
        .attr('r', radiusNode)
        .attr('fill', function(d) { return d.color; })
        .attr('svg', function(d) { return d.svg; })
        .on('click', clickNode)
        .call(d3.drag().on('start', dragstarted).on('drag', dragged).on('end', dragended));
  

    var label = svg.selectAll("text")
        .data(nodesList)
        .enter()
        .append("text")
        .text(function(d) { return d.id; })
        .attr("x", function(d) { return d.x; })
        .attr("y", function(d) { return d.y; })
        .attr("font-family", fontFamilyNodeLabel)
        .attr("font-size", fontSizeNodeLabel)
        .attr("font-width", fontWidthNodeLabel)
        .attr("fill", fontColorNodeLabel)

    function clickNode(event,d){
        console.log("El nodo", d.id, "a sido pulsado")
    }

    function ticked() {
      if(linksList != []){
        link.attr('x1', d => d.source.x)
          .attr('y1', d => d.source.y)
          .attr('x2', d => d.target.x)
          .attr('y2', d => d.target.y)
          .attr( "d", (d) => "M" + d.source.x + "," + d.source.y + ", " + d.target.x + "," + d.target.y);
      }

      if(nodesList != []){
        node.attr('cx', d => d.x)
            .attr('cy', d => d.y);

        label.attr('x', d => d.x - 50)
        .attr('y', d => d.y - 30);
      }
    }

    function dragstarted(event, d) {
      if (!event.active) simulation.alphaTarget(0.3).restart();
      d.fx = d.x;
      d.fy = d.y;
    }

    function dragged(event, d) {
      d.fx = event.x;
      d.fy = event.y;
    }

    function dragended(event, d) {
      if (!event.active) simulation.alphaTarget(0);
      d.fx = null;
      d.fy = null;
    }

    simulation.on('tick', ticked);

  }, []);

  return (
    <svg ref={svgRef} width={props.width} height={props.height} />
  );
};

export default Graph;