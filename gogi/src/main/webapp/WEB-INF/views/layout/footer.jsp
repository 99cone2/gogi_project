<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<footer class="text-center text-lg-start bg-light text-muted">
  <section class="d-flex justify-content-center justify-content-center p-4 border-bottom">
    <div>
     	������ �Ѱᰰ��
    </div>
  </section>


    <div class="container" style="padding-left: 200px; padding-right: 200px;">
    

        <div class="col-md-4 col-lg-2 col-xl-2 mx-auto mb-4">
          <h6 class="text-uppercase fw-bold mb-4">
            ���� ���� �޴�
          </h6>
          <p>
            <a href="${contextPath}/main/main.do" class="text-reset">Ȩ</a>
          </p>
          <p>
            <a href="${contextPath}/admin/notice/listNotice.do" class="text-reset">��������</a>
          </p>
          <p>
            <a href="${contextPath}/board/qna/listQna.do" class="text-reset">�������亯</a>
          </p>
          <p>
            <a href="${contextPath}/board/review/listReview.do" class="text-reset">�ı�</a>
          </p>
        </div>

        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
          <h6 class="text-uppercase fw-bold mb-4">������</h6>
          <div id="daumRoughmapContainer1678798418740" class="root_daum_roughmap root_daum_roughmap_landing"></div>
	      <script charset="UTF-8" class="daum_roughmap_loader_script" src="https://ssl.daumcdn.net/dmaps/map_js_init/roughmapLoader.js"></script>
		  <script charset="UTF-8">
		    new daum.roughmap.Lander({
			"timestamp" : "1678798418740",
			"key" : "2e3bt",
			"mapWidth" : "400",
			"mapHeight" : "200"
			}).render();
		  </script>
          <p>���������� ���� ���� 637 ���Ϻ��� 3��</p>
          <p>+82 123 456 78</p>
          <p>+82 234 567 89</p>
        </div>    
    </div>

  <div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
	   <p class="footer_p">Copyright 2023. ����<br>
		All rights reserved.</p>
  </div>
</footer>
</body>
</html>