$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        // /location/findById/?id=1
        var href =$(this).attr('href');
        $.get(href,function (location, status) {
            $('#idEdit').val(location.locationId);
            $('#countryEdit').val(location.country);
            $('#cityEdit').val(location.city);
            $('#addressEdit').val(location.address);
            $('#emailEdit').val(location.email);
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