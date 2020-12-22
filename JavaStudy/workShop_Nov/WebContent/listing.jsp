<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/user.css">
<link rel="stylesheet" href="css/common.css">
<title>ワークショップEC</title>
</head>
<body>
	<div class="nav">
		<nav class="navbar navbar-expand bg-white">
		<div class="navbar-brand ml-2">
			<h2>WorkShop</h2>
		</div>
		<div class="row ml-2 my-auto">
			<ul class="navbar-nav mr-auto align-items-center">
				<li class="nav-item p-2 font-weight-bold">ITEMS</li>
				<li class="nav-item p-2 font-weight-bold">FEATURE</li>
				<li class="nav-item p-2 font-weight-bold">COORDINATE</li>
				<li class="nav-item p-2 font-weight-bold">SHOP</li>
				<li class="nav-item p-2 font-weight-bold">CONTENT</li>
				<li class="nav-item p-2 ml-3"><img src="img/icon/hart.png"
					alt=""></li>
				<li class="nav-item p-2"><a href="login.jsp"><img
						src="img/icon/man.png" alt=""></a></li>
				<li class="nav-item p-2"><img src="img/icon/cart.png" alt=""></li>
			</ul>
			<form class="form-inline my-1 my-lg-0 px-2">
				<input class="form-control mr-sm-1" type="search"
					placeholder="Search"> <img src="img/icon/search.png" alt=""
					type="submit">
			</form>
		</div>
		</nav>
	</div>
	<main>
		<article>
			<form action="/workShop_october/listing" method="POST" class="item_listing">
				<p class="item_name">商品名</p>
				<input type="text" name="item" id="item_name">
				<p class="price">値段</p>
				<input type="text" name="price" id="price">
				<div class="image_box">
					<p class="item_image">商品画像</p>
					<p>(*画像のリンクを添付してください)</p>
				</div>
				<input type="file" name="item_image" value="1">選択されていません
				<p class="item_category">カテゴリ</p>
				<select name="item_category">
					<option value="1">机</option>
					<option value="2">椅子</option>
					<option value="3">棚</option>
					<option value="9">その他</option> 
				</select>
				<input type="submit" value="登録する" class="listing_btn">
			</form>
		</article>
	</main>
</body>
</html>