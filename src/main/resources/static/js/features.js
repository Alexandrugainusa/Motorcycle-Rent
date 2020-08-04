$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        // /location/findById/?id=1
        var href =$(this).attr('href');
        $.get(href,function (features, status) {
            $('#featuresIdEdit').val(features.featuresId);
            $('#descriptionEdit').val(features.description);
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