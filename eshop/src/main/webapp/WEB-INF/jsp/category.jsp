<%--
  Created by IntelliJ IDEA.
  User: 文辉
  Date: 2017/7/26
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>淘一淘类别</title>
    <script src="/js/jquery.js"></script>
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/bootstrap/css/bootstrap.min.css">
    <script src="/css/bootstrap/js/bootstrap.min.js"></script>
    <script src="/js/sort.js"></script>
    <script src="/js/holder.js"></script>
    <style>
        .like-button {
            left: 80% !important;
            top: 70% !important;
        }
        .data>ul {
            padding: 0;
        }
        .page-div {
            margin-top: 10px;
        }
        .page-info {
            padding: 35px 35px 35px 55px;
        }
    </style>
</head>
<body>
<div id="main" class="container">
    <div id="header">
        <jsp:include page="header.jsp"/>
    </div>
    <div class="content">
        <div class="module">
            <div class="">
                <h3>
                    类别><span style="color: red;">${greetings}</span>
                </h3>
                <hr>
            </div>

            <div class="bd">
                <div class="data">
                    <ul>
                        <c:forEach items="${list}" var="goods">
                            <p>${goods.goodsName}</p>
                        </c:forEach>

                        <div class="clear-float" style="clear: both;"></div>
                    </ul>
                </div>
                <div class="row page-div">
                    <div class="col-md-5 page-info">
                        当前第${pageInfo.pageNum}页，共${pageInfo.pages}页，总共${pageInfo.size}条记录
                    </div>
                    <div class="col-md-6">
                        <nav aria-label="Page navigation">
                            <ul class="pagination pagination-lg">

                                <c:if test="${pageInfo.hasPreviousPage}">
                                    <li>
                                        <a href="/search?keyword=${keyword}&page=${pageInfo.prePage}" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </li>
                                </c:if>

                                <c:if test="${!pageInfo.hasPreviousPage}">
                                    <li class="disabled">
                                        <a href="/search?keyword=${keyword}&page=${pageInfo.prePage}" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </li>
                                </c:if>

                                <c:forEach items="${pageInfo.navigatepageNums}" var="pageNums">
                                    <c:if test="${pageNums == pageInfo.pageNum}">
                                        <li class="active"><a href="/search?keyword=${keyword}&page=${pageNums}">${pageNums}</a></li>
                                    </c:if>
                                    <c:if test="${pageNums != pageInfo.pageNum}">
                                        <li><a href="/search?keyword=${keyword}&page=${pageNums}">${pageNums}</a></li>
                                    </c:if>
                                </c:forEach>

                                <c:if test="${pageInfo.hasNextPage}">
                                    <li>
                                        <a href="/search?keyword=${keyword}&page=${pageInfo.nextPage}" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>
                                </c:if>

                                <c:if test="${!pageInfo.hasNextPage}">
                                    <li class="disabled">
                                        <a href="/search?keyword=${keyword}&page=${pageInfo.nextPage}" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>
                                </c:if>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

