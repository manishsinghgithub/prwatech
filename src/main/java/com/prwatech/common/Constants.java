package com.prwatech.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {

    public static final String PUBLIC_APIS_URL = "api/pub/**";
    public static final String IAM_APIS_URL = "api/iam/**";
    public static final String LOGOUT_API_URL = "api/iam/logout";
    public static final String ERROR = "Error";

    public static final String AUTH = "Authorization";
    public static final String TOKEN_TYPE = "Bearer Token";
    public static final String AUTH_PARAM_TYPE = "Header";
    public static final String AUTH_DATA_TYPE = "string";
    public static final String UNAUTHORIZED_USER_ERROR_MESSAGE = "User is not authorized to access this resource";
    public static final String USER_ACCOUNT_LOCKED_MESSAGE = "User account is locked";
    public static final String UNAUTHENTICATED_USER_ERROR_MESSAGE = "Unauthenticated User: Invalid token";
    public static final String AUTH_HEADER = "Authorization";
    public static final String TOKEN_SPLIT_REGEX = " ";
    public static final Integer DEFAULT_TOKEN_LENGTH = 2;
    public static final String INVALID_TOKEN_ERROR_MESSAGE = "Invalid token";
    public static final String USERNAME_PASSWORD_CONNECTION="Username-Password-Authentication";

}
