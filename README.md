# gestion-de-stock

<mxfile host="app.diagrams.net" modified="2023-11-27T11:58:52.487Z" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36 OPR/104.0.0.0" etag="NXirFcFJqeHJATxqDCxW" version="22.1.4" type="github">
  <diagram id="C5RBs43oDa-KdzZeNtuy" name="Page-1">
    <mxGraphModel dx="2509" dy="917" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="WIyWlLk6GJQsqaUBKTNV-0" />
        <mxCell id="WIyWlLk6GJQsqaUBKTNV-1" parent="WIyWlLk6GJQsqaUBKTNV-0" />
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--0" value="Entreprise" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-140" y="33" width="150" height="60" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-22" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="zkfFHV4jXpPFQw0GAbJ--0" vertex="1">
          <mxGeometry y="26" width="150" height="26" as="geometry" />
        </mxCell>
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--6" value="Utilisateur" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-220" y="176" width="160" height="64" as="geometry">
            <mxRectangle x="130" y="380" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-82" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="zkfFHV4jXpPFQw0GAbJ--6" vertex="1">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--13" value="MvtStk" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="610" y="128" width="160" height="62" as="geometry">
            <mxRectangle x="340" y="380" width="170" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--14" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="zkfFHV4jXpPFQw0GAbJ--13" vertex="1">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-85" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.75;exitY=0;exitDx=0;exitDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="zkfFHV4jXpPFQw0GAbJ--17" target="q17TEs4AbuAiky7hGRcs-5" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--17" value="Article" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="160" y="160" width="160" height="72" as="geometry">
            <mxRectangle x="550" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="zkfFHV4jXpPFQw0GAbJ--18" value="Street" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="zkfFHV4jXpPFQw0GAbJ--17" vertex="1">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-75" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-0" edge="1">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="520" y="420" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-0" value="Vente" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="530" y="504" width="160" height="52" as="geometry">
            <mxRectangle x="340" y="380" width="170" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-1" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-0" vertex="1">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-4" value="Categorie" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="420" y="22" width="170" height="52" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-5" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-4" vertex="1">
          <mxGeometry y="26" width="170" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-76" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-6" edge="1">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="300" y="230" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-6" value="LigneVente" style="swimlane;fontStyle=0;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="420" y="368" width="160" height="52" as="geometry">
            <mxRectangle x="340" y="380" width="170" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-83" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-6" vertex="1">
          <mxGeometry y="26" width="160" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-52" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-9" target="q17TEs4AbuAiky7hGRcs-18" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-9" value="Fournisseur" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=26;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-340" y="614" width="170" height="56" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-10" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-9" vertex="1">
          <mxGeometry y="26" width="170" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-65" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.75;exitY=0;exitDx=0;exitDy=0;entryX=0.25;entryY=1;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-11" target="zkfFHV4jXpPFQw0GAbJ--17" edge="1">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="160" y="279" as="targetPoint" />
            <Array as="points">
              <mxPoint x="-20" y="364" />
              <mxPoint x="-20" y="279" />
              <mxPoint x="200" y="279" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-11" value="LigneCdeFournisseur" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-170" y="364" width="170" height="70" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-12" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-11" vertex="1">
          <mxGeometry y="30" width="170" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-74" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-13" target="q17TEs4AbuAiky7hGRcs-20" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-13" value="Client" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="240" y="680" width="170" height="60" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-14" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-13" vertex="1">
          <mxGeometry y="30" width="170" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-67" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0;exitY=0.25;exitDx=0;exitDy=0;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-15" target="zkfFHV4jXpPFQw0GAbJ--17" edge="1">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="100" y="452" />
              <mxPoint x="100" y="333" />
              <mxPoint x="230" y="333" />
              <mxPoint x="230" y="232" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-15" value="LigneCdeClient" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="120" y="434" width="170" height="70" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-16" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-15" vertex="1">
          <mxGeometry y="30" width="170" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-56" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.25;exitY=0;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-18" target="q17TEs4AbuAiky7hGRcs-12" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-18" value="CommandeFournisseur" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-260" y="490" width="180" height="70" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-19" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-18" vertex="1">
          <mxGeometry y="30" width="180" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-46" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-20" target="q17TEs4AbuAiky7hGRcs-15" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-20" value="CommandeClient" style="swimlane;fontStyle=2;align=center;verticalAlign=top;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;resizeParent=1;resizeLast=0;collapsible=1;marginBottom=0;rounded=0;shadow=0;strokeWidth=1;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="128" y="549.5" width="170" height="70" as="geometry">
            <mxRectangle x="230" y="140" width="160" height="26" as="alternateBounds" />
          </mxGeometry>
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-21" value="id" style="text;align=left;verticalAlign=top;spacingLeft=4;spacingRight=4;overflow=hidden;rotatable=0;points=[[0,0.5],[1,0.5]];portConstraint=eastwest;" parent="q17TEs4AbuAiky7hGRcs-20" vertex="1">
          <mxGeometry y="30" width="170" height="26" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-26" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="q17TEs4AbuAiky7hGRcs-22" target="zkfFHV4jXpPFQw0GAbJ--18" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-28" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-190" y="146" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-29" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-100" y="93" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-30" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="240" y="128" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-31" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="10" y="48" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-34" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="383" y="33" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-37" value="0..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="570" y="138" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-39" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="170" y="240" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-43" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="160" y="500" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-47" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="170" y="618" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-48" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="220" y="519.5" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-50" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="330" y="158" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-51" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-20" y="330" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-54" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-285" y="588" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-55" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-170" y="560" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-57" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-255" y="458" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-58" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="-210" y="378" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-66" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="110" y="168" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-68" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="230" y="240" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-69" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="100" y="408" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-72" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="330" y="650" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-77" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="610" y="474" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-78" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="470" y="420" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-79" value="1..*" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="460" y="338" width="40" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-80" value="1" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" parent="WIyWlLk6GJQsqaUBKTNV-1" vertex="1">
          <mxGeometry x="300" y="240" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-86" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="zkfFHV4jXpPFQw0GAbJ--18" target="zkfFHV4jXpPFQw0GAbJ--14" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="q17TEs4AbuAiky7hGRcs-87" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.25;exitY=1;exitDx=0;exitDy=0;entryX=0.167;entryY=0.026;entryDx=0;entryDy=0;entryPerimeter=0;" parent="WIyWlLk6GJQsqaUBKTNV-1" source="zkfFHV4jXpPFQw0GAbJ--0" target="zkfFHV4jXpPFQw0GAbJ--6" edge="1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
