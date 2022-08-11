package collibraPerftesting;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class CreateDomain extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("http://update.googleapis.com")
    .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*detectportal\\.firefox\\.com.*"))
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Proxy-Connection", "keep-alive"),
    Map.entry("X-Goog-Update-AppId", "ihnlcenocehgdaegdmhbidjhnhdchfmm,oimompecagnajdejgnnjijobebaeigek,gcmjkmgdlgnkkcocmoeiminaijmmjnii,obedbbhbpmojnkanicioggnmelmoomoc,giekcmmlnklenlaomppkphknjmnnpneh,khaoiebndkojlmppeemjhbpbandiljpe,ggkkehgbnfjpeggfpleeakpidbkibbmn,llkgjffcdpffmhiakmfcdcblohccpfmo,imefjhfbkmcmebodilednhmaccmincoa,dhlpobdgcjafebgbbhjdnapejmpkgiie,ojhpjlocmbogdgmfpkhlaaeamibhnphh,lmelglejhemejginpboagddgdfbepgmp,dnhnnofocefcglhjeigmkhcgfoaipbaa,laoigpblnllgcgjnjnllmfolckpjlhki,jflookgnkcckhobaglndicnbbgbonegd,efniojlnjndmcbiieegkicadnoecjjef,hfnkpimlhhgieaddgfemjhofmfblmnib,eeigpngbgcognadeebkilcpcaedhellh,gonpemdgkjcecdgbnaabipppbmgfggbe,npdjjkjlcidkjlamlmmdelcjbcpdjocm"),
    Map.entry("X-Goog-Update-Interactivity", "bg"),
    Map.entry("X-Goog-Update-Updater", "chrome-104.0.5112.79")
  );
  
  private Map<CharSequence, String> headers_1 = Map.of("Proxy-Connection", "keep-alive");
  
  private Map<CharSequence, String> headers_2 = Map.ofEntries(
    Map.entry("Content-Type", "application/json"),
    Map.entry("Proxy-Connection", "keep-alive")
  );
  
  private String uri1 = "http://edgedl.me.gvt1.com/edgedl";

  private ScenarioBuilder scn = scenario("CreateDomain")
    .exec(
      http("request_0")
        .post("/service/update2/json?cup2key=12:xb6vqTfzL8DrXtPCNb2MhpQvJ4T3pSqw8uHO6h1Y6ZU&cup2hreq=5aa9143939e9cc4f179f8a25f07e80bce351c3b13ad3ccabb731d66cf8a7676e")
        .headers(headers_0)
        .body(RawFileBody("collibraPerftesting/createdomain/0000_request.json"))
        .resources(
          http("request_1")
            .get(uri1 + "/release2/chrome_component/adhui3qqd4anvexoejpykvwzmu2a_2022.6.27.0/dnhnnofocefcglhjeigmkhcgfoaipbaa_2022.06.27.00_all_lc5fjsya2oafsryxzhafk7chkm.crx3")
            .headers(headers_1),
          http("request_2")
            .post("/service/update2/json")
            .headers(headers_2)
            .body(RawFileBody("collibraPerftesting/createdomain/0002_request.json")),
          http("request_3")
            .get(uri1 + "/delta-update/hfnkpimlhhgieaddgfemjhofmfblmnib/1.70ccfe7f6af0c17051f8ba39ef7e46cd0a6b45c47d6b93a804e258536c4464f2/1.ac2eaf326e9febab502412b9b43d32e450fa9a261985998326b1f7b743d393a8/0e3137126b71bc1d95b4e1e1be82e21206801ed39830fe0aab0ec4ab21efb077.crxd")
            .headers(headers_1),
          http("request_4")
            .post("/service/update2/json")
            .headers(headers_2)
            .body(RawFileBody("collibraPerftesting/createdomain/0004_request.json"))
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(2))).protocols(httpProtocol);
  }
}
