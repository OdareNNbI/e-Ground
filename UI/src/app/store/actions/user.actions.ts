import {User} from '../../model/User';

export const CREATE_USER = 'CREATE_USER';
export const CREATE_USER_SUCCESS = 'CREATE_USER_SUCCESS';
export const CREATE_USER_FAILED = 'CREATE_USER_FAILED';


export function createUserAction(user: User) {
  return {
    type: CREATE_USER,
    payload: {user}
  };
}

export function createUserSuccessAction(user: User) {
  return {
    type: CREATE_USER_SUCCESS,
    payload: {user}
  };
}

export function createUserFailedAction(errorMessage: string) {
  return {
    type: CREATE_USER_FAILED,
    error: true,
    payload: {errorMessage}
  };
}
