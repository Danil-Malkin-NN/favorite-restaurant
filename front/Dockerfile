FROM node:alpine

WORKDIR /usr/app

EXPOSE 3000

COPY ./ ./

RUN yarn

CMD ["yarn", "start"]