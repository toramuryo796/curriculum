/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2021-01-27 08:30:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPではGET、POST、またはHEADのみが許可されます。 JasperはOPTIONSも許可しています。");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/lp.css\">\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("      <div class=\"header-left\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("          <img src=\"img/logo.png\" class=\"logo\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"header-right\">\n");
      out.write("        <div class=\"header-nav\">\n");
      out.write("          <ul>\n");
      out.write("            <li class=\"header-list\"><a href=\"#\">ご相談の流れ</a></li>\n");
      out.write("            <li class=\"header-list\"><a href=\"#\">弁護士費用</a></li>\n");
      out.write("            <li class=\"header-list\"><a href=\"#\">弁護士紹介</a></li>\n");
      out.write("            <li class=\"header-list\"><a href=\"#\">アクセス</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tel\">\n");
      out.write("          <p class=\"tel-title\">電話で無料相談お申し込み</p>\n");
      out.write("          <div class=\"tel-num-lbox\">\n");
      out.write("            <div class=\"tel-num-box\">\n");
      out.write("              <div class=\"header-img-box\">\n");
      out.write("                <img src=\"img/hd-cv-tel-ic.png\" class=\"header-img\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"tel-index\">\n");
      out.write("                <p class=\"tel-num\">0120-181-398</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"tel-time\">受付時間:平日 10:00-18:00</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mail-form\">\n");
      out.write("          <p class=\"mail-title\">メールで無料相談お申し込み</p>\n");
      out.write("          <div class=\"mail-form-box\">\n");
      out.write("            <img src=\"img/hd-cv-mail-ic.png\" class=\"header-img\">\n");
      out.write("            <p class=\"mial-form-index\">お申し込みフォーム</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"semi-header\">\n");
      out.write("      <div class=\"semi-header-list-box\">\n");
      out.write("        <ul class=\"semi-header-list\">\n");
      out.write("          <li>残業代請求</li>\n");
      out.write("          <li>不当解雇</li>\n");
      out.write("          <li>退職代行サービス</li>\n");
      out.write("          <li>労働災害</li>\n");
      out.write("          <li>待遇格差</li>\n");
      out.write("          <li>最新解決事例</li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-rousai\">\n");
      out.write("      <div class=\"rousai-position\">\n");
      out.write("        <img src=\"img/hero-bg.jpg\" class=\"hero-bg\">\n");
      out.write("        <img src=\"img/hero-circle-link-5-bg.png\" class=\"hero-circle\">\n");
      out.write("        <div class=\"rousai-left\">\n");
      out.write("          <div class=\"rousai-title\">\n");
      out.write("            <p>弁護士法人サリュの残業代請求</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"rousai-text\">\n");
      out.write("            <p class=\"dot\">・・・・　・・・</p>\n");
      out.write("            <p class=\"rousai-main-text\">\n");
      out.write("              働いた分の残業代を、きちんと。\n");
      out.write("            </p>\n");
      out.write("            <p class=\"rousai-attention\"><u>\n");
      out.write("              残業代請求は2年の時効があります。<br>\n");
      out.write("              あなたの残業時間をタダ働きで終わらせないように。\n");
      out.write("            </u></p>\n");
      out.write("            <p class=\"rousai-support\">\n");
      out.write("              一生懸命働くあなたを全力でサポートいたします。<br>\n");
      out.write("              残業代請求・不当解雇・退職代行サービス・労働災害・ハラスメント等、<br>\n");
      out.write("              あらゆる労働問題に対応いたします。<br>\n");
      out.write("              会社に不満があったら、サリュの弁護士にご相談ください。\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- ここから中郡さん -->\n");
      out.write("    <div class=\"strong-point\">\n");
      out.write("      <div class=\"strong-left\">\n");
      out.write("        <p class=\"strong-title\">弁護士法人サリュの強み</p>\n");
      out.write("        <p class=\"strong-text\">\n");
      out.write("          残業代の回収に<span class=\"red\">早く、</span>戦略的に<br>\n");
      out.write("          実際に残業代を回収できなければ<br>\n");
      out.write("          <span class=\"red\">報酬は発生しません</span>\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"strong-right\">\n");
      out.write("        <img src=\"img/sec1-img1.png\" class=\"sec1-img1\">\n");
      out.write("        <div class=\"strong-link\">\n");
      out.write("          <img src=\"img/arrow-round-down.png\" class=\"arrow-down\">\n");
      out.write("          <p class=\"strong-cost\">弁護士費用の詳細は<a href=\"#\" class=\"strong-cost-link\">こちら</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \t<div class=\"sample\"><u><center>弁護士法人サリュの<br>\n");
      out.write("\t最新解決事例</center></u></div>\n");
      out.write("\t<div class=\"case1\">営業社員に対する固定残業代の支払いの有効性、店長の管理監督者性が問題になった事例について\n");
      out.write("\t\t<div class=\"case1-1\">訴訟により<font color=red><u><span>550</span>万円以上</u></font>の回収！</div><br>\n");
      out.write("\t</div><br><br>\n");
      out.write("\t<div class=\"case2\">運送業のトラック運転手の労働時間及び労働者性が問題になった事例について\n");
      out.write("\t\t<div class=\"case2-1\">訴訟により<font color=red><u><span>280</span>万円以上</u></font>の回収！</div><br>\n");
      out.write("\t</div><br><br>\n");
      out.write("\t<div class=\"case3\">休憩時間と労働時間の区別及び始業前の労働時間性が問題になった事例について\n");
      out.write("\t\t<div class=\"case3-1\">交渉により早期に<font color=red><u><span>85</span>万円</u></font>を回収！</div><br>\n");
      out.write("\t\t</div><br><br>\n");
      out.write("\t<div class=\"case4\">年俸制における固定残業代の明確区分性が問題になった事例について\n");
      out.write("\t\t<div class=\"case4-1\">早期に示談金<font color=red><u><span>195</span>万円</u></font>を回収！</div><br>\n");
      out.write("\t</div><br><br>\n");
      out.write("\t<div class=\"case5\">現場作業員の固定残業代制の有効性、管理監督者性が問題となった事例について\n");
      out.write("\t\t<div class=\"case5-1\">訴訟により<font color=red><u><span>350</span>万円以上</u></font>の回収！</div>\t<br>\n");
      out.write("\t</div><br><br>\n");
      out.write("\t<div class=\"hiyou\">\n");
      out.write("\t\t弁護士費用は？<br>\n");
      out.write("\t\t回収できなければ報酬なしの、完全成功報酬制！\n");
      out.write("\t\t<div class=\"hiyou1\">弁護士費用 (税別)<br>\n");
      out.write("\t\tサリュの弁護士費用は完全成功報酬制<br>\n");
      out.write("\t\t実際に回収した残業代の中から報酬をいただきますので、回収できなければ報酬は発生しません。</div>\n");
      out.write("\t\t<div class=\"hiyou2\">初期費用<br>\n");
      out.write("\t\tご依頼時に費用がかかりませんので、<br>\n");
      out.write("\t\t安心してご相談ください。</div>\n");
      out.write("\t\t<div class=\"gray\">※会社側の支払の資力がない場合または残業の証拠が全くない場合等事案によって別の料金体系とすることがあります。<br>\n");
      out.write("\t\t※労働審判については５％。裁判については、10％の追加報酬が発生します。<br>\n");
      out.write("\t\t※労働審判または裁判をする場合には、一回の裁判の期日ごとに2万円（税別）の事務手数料が発生します。<br>\n");
      out.write("\t\t※民事保全、強制執行については別途費用が発生します。<br>\n");
      out.write("\t\t※上記の他、別途実費が発生します。</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"blue\">他にも会社から嫌がらせを<br>\n");
      out.write("\t受けていませんか？<br>\n");
      out.write("\t残業代を請求したいと思ったきっかけを、<br>\n");
      out.write("\tサリュは応援します。<br>\n");
      out.write("\t\t<div class=\"blue1\">不当解雇・退職勧奨<br>\n");
      out.write("\t\t身に覚えのない理由で解雇された、執拗に退職勧奨を受けたなど、退職に納得がいかない…残業代の請求に加えて、有効な解決策があります。</div>\n");
      out.write("\t\t<div class=\"blue2\">退職代行サービス<br>\n");
      out.write("\t\t退職を言い出しにくい、退職届を受理してもらえない、離職票を交付してくれないなど、退職にまつわるトラブルを弁護士がまとめて解決します。</div>\n");
      out.write("\t\t<div class=\"blue3\">労働災害・損害賠償請求<br>\n");
      out.write("\t\t業務中起きた事故・災害に関して、労災申請手続きのサポート、会社への損害賠償請求を弁護士に依頼したい方</div>\n");
      out.write("\t\t<div class=\"blue4\">セクハラ・パワハラ<br>\n");
      out.write("\t\t上司からセクハラやパワハラを受け精神的苦痛を受けた方は会社に対して慰謝料を請求できる場合があります。</div>\n");
      out.write("\t\t<div class=\"blue5\">待遇格差<br>\n");
      out.write("\t\t不合理な待遇格差がある場合、会社に対して手当・休暇相当額の損害賠償請求をできる場合があります。</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"step\">ご相談から<br>\n");
      out.write("\t\t解決までの流れ\n");
      out.write("\t\t<div class=\"step1\">STEP1<br>\n");
      out.write("\t\t状況把握&ご予約<br>\n");
      out.write("\t\tまずは、メールや電話で事件の概要をお伝え下さい。相談の日時を決定致します。</div>\n");
      out.write("\t\t<div class=\"step2\">STEP2<br>\n");
      out.write("\t\tご相談<br>\n");
      out.write("\t\t弁護士が直接お客様と面談し、相談に応じます。この際、適切な解決方法を提案致します。</div>\n");
      out.write("\t\t<div class=\"step3\">STEP3<br>\n");
      out.write("\t\t証拠収集&残業代計算<br>\n");
      out.write("\t\tご契約後、証拠が会社側にある場合には開示するように請求するなど証拠収集をし、残業代を計算します。</div>\n");
      out.write("\t\t<div class=\"step4\">STEP4<br>\n");
      out.write("\t\t交渉<br>\n");
      out.write("\t\t内容証明郵便により会社に残業代を請求し交渉を重ねます。交渉がうまくいかなくなった場合には、労働審判・裁判を提起します。</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"tel\">\n");
      out.write("\t\tまずは無料の法律相談から<br>\n");
      out.write("\t\t一人で抱え込まず、サリュの弁護士に<br>\n");
      out.write("\t\tお気軽にご相談ください。<br>\n");
      out.write("\t\t<div class=\"tel1\"></div>\n");
      out.write("\t\t<div class=\"mail\"></div>\n");
      out.write("\t</div>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}