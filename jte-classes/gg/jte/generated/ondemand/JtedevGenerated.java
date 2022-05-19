package gg.jte.generated.ondemand;
import objects.Dev;
import java.util.*;
public final class JtedevGenerated {
	public static final String JTE_NAME = "dev.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,15,15,15,16,16,16,17,17,17,17,17,17,17,17,17,17,19,19,24};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, ArrayList<Dev> devs) {
		jteOutput.writeContent("\n\n<html lang=\"en\">\n\n<head>\n    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css\">\n</head>\n\n<body>\n\n    <a href=\"/\">Home</a>\n    <br>\n    ");
		for (Dev dev : devs) {
			jteOutput.writeContent("\n      ");
			jteOutput.setContext("body", null);
			jteOutput.writeUserContent(dev.getName());
			jteOutput.writeContent("\n      <a");
			if (gg.jte.runtime.TemplateUtils.isAttributeRendered(dev.geturl())) {
				jteOutput.writeContent(" href=\"");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(dev.geturl());
				jteOutput.writeContent("\"");
			}
			jteOutput.writeContent(">");
			jteOutput.setContext("a", null);
			jteOutput.writeUserContent(dev.geturl());
			jteOutput.writeContent("</a>\n      \n    ");
		}
		jteOutput.writeContent("\n\n   \n</body>\n\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		ArrayList<Dev> devs = (ArrayList<Dev>)params.get("devs");
		render(jteOutput, jteHtmlInterceptor, devs);
	}
}
