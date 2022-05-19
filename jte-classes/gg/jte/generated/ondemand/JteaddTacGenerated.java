package gg.jte.generated.ondemand;
public final class JteaddTacGenerated {
	public static final String JTE_NAME = "addTac.jte";
	public static final int[] JTE_LINE_INFO = {26,26,26,26,26,26};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<html lang=\"en\">\n\n<head>\n   <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css\">\n</head>\n\n<body>\n    \n          <form method=\"post\">\n\n            <label>Name:</label><br>\n            <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter the name of the Mitre Tactic\"><br>\n\n            <label>ID:</label><br>\n            <input type=\"text\" id=\"id\" name=\"id\" placeholder=\"Enter the ID for the Mitre Tactic\"><br>\n  \n            <label>Description:</label><br>\n            <input type=\"text\" id=\"description\" name=\"description\" placeholder=\"Enter the description of the Mitre Tactic\"><br>\n\n            <input type=\"submit\" value=\"Add Tactic\">\n          </form>\n    \n\n    <a href=\"/\">Back</a>\n\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
