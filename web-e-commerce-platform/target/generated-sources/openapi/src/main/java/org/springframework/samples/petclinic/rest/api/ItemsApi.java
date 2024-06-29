/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.springframework.samples.petclinic.rest.api;

import org.springframework.samples.petclinic.rest.dto.ErrorDto;
import org.springframework.samples.petclinic.rest.dto.ItemDto;
import org.springframework.samples.petclinic.rest.dto.ItemFieldsDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-07T02:29:36.569825600+08:00[Asia/Shanghai]")
@Validated
@Tag(name = "items", description = "the items API")
public interface ItemsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /items : Create a item
     * Creates a item.
     *
     * @param itemFieldsDto The item (required)
     * @return Item created successfully. (status code 201)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or User not found. (status code 404)
     *         or Server error. (status code 500)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "addItem",
        summary = "Create a item",
        description = "Creates a item.",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Item created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/items",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ItemDto> addItem(
        @Parameter(name = "ItemFieldsDto", description = "The item", required = true) @Valid @RequestBody ItemFieldsDto itemFieldsDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /items/{itemId}/addone
     *
     * @param itemId The ID of the item. (required)
     * @return Item details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or User not found. (status code 404)
     *         or Server error. (status code 500)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "addItemById",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Item details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/items/{itemId}/addone",
        produces = { "application/json" }
    )
    default ResponseEntity<ItemDto> addItemById(
        @Parameter(name = "itemId", description = "The ID of the item.", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /items/{itemId} : Delete an item by ID
     * Returns the item or a 404 error.
     *
     * @param itemId The ID of the item. (required)
     * @return Item details found and returned. (status code 200)
     *         or Delete Ok (status code 204)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or Item not found. (status code 404)
     *         or Server error. (status code 500)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "deleteItem",
        summary = "Delete an item by ID",
        description = "Returns the item or a 404 error.",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Item details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemDto.class))
            }),
            @ApiResponse(responseCode = "204", description = "Delete Ok"),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Item not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/items/{itemId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ItemDto> deleteItem(
        @Parameter(name = "itemId", description = "The ID of the item.", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /items : List all items
     *
     * @return A paged array of items (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "listItems",
        summary = "List all items",
        tags = { "items" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A paged array of items", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ItemDto.class)))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ItemDto>> listItems(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ null, null ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /items/{itemId} : Info for a specific item
     *
     * @param itemId The id of the item to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "showItemById",
        summary = "Info for a specific item",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemDto.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items/{itemId}",
        produces = { "application/json" }
    )
    default ResponseEntity<ItemDto> showItemById(
        @Parameter(name = "itemId", description = "The id of the item to retrieve", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /items/{itemId}/subone
     *
     * @param itemId The ID of the item. (required)
     * @return Item details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or User not found. (status code 404)
     *         or Server error. (status code 500)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "subItemById",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Item details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/items/{itemId}/subone",
        produces = { "application/json" }
    )
    default ResponseEntity<ItemDto> subItemById(
        @Parameter(name = "itemId", description = "The ID of the item.", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /items/{itemId} : Update a item&#39;s details
     * Updates the item record with the specified details.
     *
     * @param itemId The ID of the item. (required)
     * @param itemFieldsDto The item details to use for the update. (required)
     * @return Item details found and returned. (status code 200)
     *         or Not modified. (status code 304)
     *         or Bad request. (status code 400)
     *         or User not found. (status code 404)
     *         or Server error. (status code 500)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "updateItem",
        summary = "Update a item's details",
        description = "Updates the item record with the specified details.",
        tags = { "item" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Item details found and returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemDto.class))
            }),
            @ApiResponse(responseCode = "304", description = "Not modified."),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "500", description = "Server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            }),
            @ApiResponse(responseCode = "default", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/items/{itemId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ItemDto> updateItem(
        @Parameter(name = "itemId", description = "The ID of the item.", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId,
        @Parameter(name = "ItemFieldsDto", description = "The item details to use for the update.", required = true) @Valid @RequestBody ItemFieldsDto itemFieldsDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
