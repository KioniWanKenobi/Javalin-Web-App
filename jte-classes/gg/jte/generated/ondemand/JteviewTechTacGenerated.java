package gg.jte.generated.ondemand;
import objects.mitreTactic;
import java.util.*;
public final class JteviewTechTacGenerated {
	public static final String JTE_NAME = "viewTechTac.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,16,16,16,16,18,18,20,20,22,22,25,25,27,27,27,28,28,28,29,29,29,31,31,36};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ArrayList<mitreTactic> tactics) {
		jteOutput.writeContent("\n\n<html lang=\"en\">\n\n<head>\n    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css\">\n</head>\n\n<body>\n\n    <a href=\"/\">Home</a>\n    <br>\n    <br>\n    You have ");
		jteOutput.setContext("body", null);
		jteOutput.writeUserContent(tactics.size());
		jteOutput.writeContent(" tactic(s) documented. \n\n    ");
		if (tactics.size()>=14) {
			jteOutput.writeContent("\n      You've got them all - well done!\n    ");
		} else {
			jteOutput.writeContent("\n      Still some to document - keep going!\n    ");
		}
		jteOutput.writeContent("\n   \n\n    ");
		for (mitreTactic tactic : tactics) {
			jteOutput.writeContent("\n      <details>\n        <summary>");
			jteOutput.setContext("summary", null);
			jteOutput.writeUserContent(tactic.getName());
			jteOutput.writeContent("</summary>\n          <li>ID: ");
			jteOutput.setContext("li", null);
			jteOutput.writeUserContent(tactic.getid());
			jteOutput.writeContent("</li>\n          <li>");
			jteOutput.setContext("li", null);
			jteOutput.writeUserContent(tactic.getDescription());
			jteOutput.writeContent("</li>\n      </details>\n    ");
		}
		jteOutput.writeContent("\n\n   \n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ArrayList<mitreTactic> tactics = (ArrayList<mitreTactic>)params.get("tactics");
		render(jteOutput, jteHtmlInterceptor, tactics);
	}
}
