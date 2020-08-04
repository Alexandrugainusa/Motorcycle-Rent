$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        // /location/findById/?id=1
        var href =$(this).attr('href');
        $.get(href,function (users, status) {
            $('#idEdit').val(users.userId);
            $('#usernameEdit').val(users.username);
            $('#surnameEdit').val(users.surname);
            $('#loginEdit').val(users.login);
            $('#passwordEdit').val(users.password);
            $('#emailEdit').val(users.email);
        });

        $('#editModal').modal();
    });

    $('table #deleteButton').on('click',function (event) {
        event.preventDefault();
        var href=$(this).attr('href'); // asignat la butonul YES!

        $('#confirmDeleteButton').attr('href',href);

        $('#deleteModal').modal();

    })

});