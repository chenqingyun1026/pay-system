<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>微信支付</title>

    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.5.1/jquery.min.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>

</head>
<body>
    <div id="myQrcode"></div>
    <script>
        jQuery('#myQrcode').qrcode({
            text	: "${codeUrl}"
        });
    </script>
</body>

</html>